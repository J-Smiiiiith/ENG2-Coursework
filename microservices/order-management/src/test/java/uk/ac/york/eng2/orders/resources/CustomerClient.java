package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerDTO;

import java.util.List;

@Client(CustomerController.PREFIX)
public interface CustomerClient {

    @Get
    List<Customer> getCustomers();

    @Get("/{id}")
    Customer getCustomer(@PathVariable long id);

    @Post
    HttpResponse<Void> createCustomer(@Body CustomerDTO dto);

    @Put("/{id}")
    void updateCustomer(@PathVariable long id, @Body CustomerDTO dto);

    @Delete("/{id}")
    void deleteCustomer(@PathVariable long id);

}
