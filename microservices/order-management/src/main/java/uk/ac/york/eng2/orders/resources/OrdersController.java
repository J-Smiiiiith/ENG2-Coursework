package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import io.micronaut.transaction.annotation.Transactional;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrderItemDTO;
import uk.ac.york.eng2.orders.dto.OrdersCreateDTO;
import uk.ac.york.eng2.orders.dto.OrdersDTO;
import uk.ac.york.eng2.orders.events.OrdersByDayProducer;
import uk.ac.york.eng2.orders.events.ProductDayQuantity;
import uk.ac.york.eng2.orders.gateways.ProductManagementGateway;
import uk.ac.york.eng2.orders.repository.CustomerRepository;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;
import uk.ac.york.eng2.orders.repository.OrdersRepository;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller(OrdersController.PREFIX)
@Tag(name = "Orders")
public class OrdersController {
    public static final String PREFIX = "/orders";
    
    @Inject
    OrdersRepository ordersRepo;

    @Inject
    OrderItemRepository orderItemRepo;

    @Inject
    CustomerRepository customerRepo;

    @Inject
    ProductManagementGateway productManagementGateway;

    @Inject
    OrdersByDayProducer producer;

    @Get
    public List<Orders> getOrders() {
        return ordersRepo.findAll();
    }

    @Get("/{id}")
    public Orders getOrder(@PathVariable long id) {
        return ordersRepo.findById(id).orElse(null);
    }

    @Post
    @Transactional
    @ExecuteOn(TaskExecutors.BLOCKING)
    public HttpResponse<Void> createOrders(@Body OrdersCreateDTO dto) {
        Orders order = new Orders();
        order.setDateCreated(LocalDate.now().toString());
        order.setAddress(dto.getAddress());
        order.setDelivered(false);
        order.setPaid(false);

        Customer customer = customerRepo.findById(dto.getCustomerId()).orElse(null);
        if (customer == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        }
        else {
            order.setCustomer(customer);
        }
        ordersRepo.save(order);

        Map<Long, Integer> products = dto.getProducts();
        Map<String, Map<Long, Integer>> validInvalidProducts = productManagementGateway.checkProductsValidity(products);
        Map<Long, Integer> validProducts = validInvalidProducts.get("Valid Products");

        List<ProductDayQuantity> productDayQuantities = new ArrayList<>();

        for (Long productId : validProducts.keySet()) {
            OrderItem item = new OrderItem();
            item.setProductId(productId);
            int quantity = products.get(productId);
            item.setQuantity(quantity);
            item.setOrder(order);
            orderItemRepo.save(item);
            productDayQuantities.add(new ProductDayQuantity(item.getProductId(), order.getDateCreated(), quantity));
        }
        order.setTotalAmount(productManagementGateway.getProductsPrice(validProducts));
        ordersRepo.save(order);

        for (ProductDayQuantity productDayQuantity : productDayQuantities) {
            producer.orderPlaced(order.getId(), productDayQuantity);
        }
        return HttpResponse.created(URI.create(PREFIX + "/" + order.getId()));
    }

    @Put("/{id}")
    @Transactional
    public void updateOrders(@PathVariable long id, @Body OrdersDTO dto) {
        Orders order = ordersRepo.findById(id).orElse(null);
        if (order == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Orders not found");
        } else {
            Customer customer = customerRepo.findById(dto.getCustomerId()).orElse(null);
            if (customer == null) {
                throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
            }
            else {
                order.setCustomer(customer);
            }
            order.setAddress(dto.getAddress());
            order.setPaid(dto.isPaid());
            order.setDelivered(dto.isDelivered());
            order.setCustomer(customer);
            ordersRepo.save(order);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteOrders(@PathVariable long id) {
        Orders order = ordersRepo.findById(id).orElse(null);
        if (order == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Orders not found");
        } else {
            ordersRepo.delete(order);
        }
    }
}
