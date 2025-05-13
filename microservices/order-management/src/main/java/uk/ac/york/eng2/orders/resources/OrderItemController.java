package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemDTO;
import uk.ac.york.eng2.orders.repository.OrderItemRepository;

import java.net.URI;
import java.util.List;

@Controller(OrderItemController.PREFIX)
public class OrderItemController {
    public static final String PREFIX = "/order-items";

    @Inject
    OrderItemRepository orderItemRepo;

    @Get
    public List<OrderItem> getOrderItems() {
        return orderItemRepo.findAll();
    }

    @Get("/{id}")
    public OrderItem getOrderItem(@PathVariable Long id) {
        return orderItemRepo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createOrderItem(@Body OrderItemDTO dto) {
        OrderItem orderItem = new OrderItem();
        orderItem.setProductId(dto.getProductId());
        orderItem.setQuantity(dto.getQuantity());
        orderItem.setOrder(dto.getOrderId());
        orderItem.setUnitPrice(0); //temp - will be taken from product client
        orderItemRepo.save(orderItem);
        return HttpResponse.created(URI.create(PREFIX + "/" + orderItem.getId()));
    }
}
