package uk.ac.york.eng2.orders;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Orders;
import uk.ac.york.eng2.orders.dto.OrderCreateDTO;
import uk.ac.york.eng2.orders.dto.OrdersDTO;
import uk.ac.york.eng2.orders.resources.OrdersController;

import java.util.List;

@Client(OrdersController.PREFIX)
public interface OrdersClient {

    @Get
    List<Orders> getOrders();

    @Get("/{id}")
    Orders getOrder(@PathVariable long id);

    @Post
    HttpResponse<Void> createOrders(@Body OrderCreateDTO dto);

    @Put("/{id}")
    void updateOrders(@PathVariable long id, @Body OrdersDTO dto);

    @Delete("/{id}")
    void deleteOrders(@PathVariable long id);
}
