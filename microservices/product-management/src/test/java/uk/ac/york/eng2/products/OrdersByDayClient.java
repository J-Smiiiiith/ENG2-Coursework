package uk.ac.york.eng2.products;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.dto.OrdersByDayDTO;
import uk.ac.york.eng2.products.resources.OrdersByDayController;

import java.util.List;

@Client(OrdersByDayController.PREFIX)
public interface OrdersByDayClient {

    @Get
    List<OrdersByDay> getOrdersByDay();

    @Get("/{id}")
    OrdersByDay getOrdersByDay(@PathVariable long id);

    @Post
    HttpResponse<Void> createOrdersByDay(@Body OrdersByDayDTO dto);

    @Put("/{id}")
    void updateOrdersByDay(@PathVariable long id, @Body OrdersByDayDTO dto);

    @Delete("/{id}")
    void deleteOrdersByDay(@PathVariable long id);
}
