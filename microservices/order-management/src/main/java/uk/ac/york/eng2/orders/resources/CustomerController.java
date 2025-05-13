package uk.ac.york.eng2.orders.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.inject.Inject;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import java.net.URI;
import java.util.List;

@Controller(CustomerController.PREFIX)
@Tag(name = "Customers")
public class CustomerController {
    public static final String PREFIX = "/customers";

    @Inject
    CustomerRepository customerRepo;

    @Get
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Get("/{id}")
    public Customer getCustomer(@PathVariable long id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Post
    public HttpResponse<Void> createCustomer(@Body CustomerDTO dto) {
        Customer customer = new Customer();
        customer.setEmail(dto.getEmail());
        customer.setFirstName(dto.getFirstName());
        customer.setFamilyName(dto.getFamilyName());
        customerRepo.save(customer);
        return HttpResponse.created(URI.create(PREFIX + "/" + customer.getId()));
    }

    @Put("/{id}")
    public void updateCustomer(@PathVariable long id, @Body CustomerDTO dto) {
        Customer customer = customerRepo.findById(id).orElse(null);
        if (customer == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        } else {
            if (dto.getEmail() != null) {
                customer.setEmail(dto.getEmail());
            }
            if (dto.getFirstName() != null) {
                customer.setFirstName(dto.getFirstName());
            }
            if (dto.getFamilyName() != null) {
                customer.setFamilyName(dto.getFamilyName());
            }
            customerRepo.update(customer);
        }
    }

    @Delete("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        Customer customer = customerRepo.findById(id).orElse(null);
        if (customer == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Customer not found");
        } else {
            customerRepo.delete(customer);
        }
    }
}
