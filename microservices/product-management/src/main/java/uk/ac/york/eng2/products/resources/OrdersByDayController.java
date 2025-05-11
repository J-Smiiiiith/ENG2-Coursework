package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.dto.OrdersByDayDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;

import java.net.URI;
import java.util.List;

@Tag(name = "Orders By Day")
@Controller(OrdersByDayController.PREFIX)
public class OrdersByDayController {
    public static final String PREFIX = "/orders-by-day";

    @Inject
    OrdersByDayRepository repo;

    @Get
    public List<OrdersByDay> getOrdersByDay() {
        return repo.findAll();
    }

    @Get("/{id}")
    public OrdersByDay getOrdersByDay(@PathVariable long id) {
        return repo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createOrdersByDay(@Body OrdersByDayDTO dto) {
        OrdersByDay ordersByDay = new OrdersByDay();
        ordersByDay.setDay(dto.getDay());
        ordersByDay.setCount(dto.getCount());
        ordersByDay.setProduct(dto.getProduct());
        repo.save(ordersByDay);
        return HttpResponse.created(URI.create(PREFIX + "/" + ordersByDay.getId()));
    }

    @Put("/{id}")
    @Transactional
    public void updateOrdersByDay(@PathVariable long id, @Body OrdersByDayDTO dto) {
        OrdersByDay ordersByDay = repo.findById(id).orElse(null);
        if (ordersByDay == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "OrdersByDay not found");
        } else {
            if (dto.getDay() != null) {
                ordersByDay.setDay(dto.getDay());
            }
            if (dto.getCount() != null) {
                ordersByDay.setCount(dto.getCount());
            }
            if (dto.getProduct() != null) {
                ordersByDay.setProduct(dto.getProduct());
            }
            repo.save(ordersByDay);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteOrdersByDay(@PathVariable long id) {
        OrdersByDay ordersByDay = repo.findById(id).orElse(null);
        if (ordersByDay == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "OrdersByDay not found");
        } else {
            repo.delete(ordersByDay);
        }
    }
}
