package uk.ac.york.eng2.orders;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.OrderItem;
import uk.ac.york.eng2.orders.dto.OrderItemDTO;
import uk.ac.york.eng2.orders.resources.OrderItemController;

import java.util.List;

@Client(OrderItemController.PREFIX)
public interface OrderItemClient {

    @Get
    List<OrderItem> getOrderItems();

    @Get("/{id}")
    OrderItem getOrderItem(@PathVariable Long id);

    @Post
    HttpResponse<Void> createOrderItem(@Body OrderItemDTO dto);
}
