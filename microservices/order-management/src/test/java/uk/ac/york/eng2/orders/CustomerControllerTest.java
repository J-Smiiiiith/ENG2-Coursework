package uk.ac.york.eng2.orders;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.york.eng2.orders.domain.Customer;
import uk.ac.york.eng2.orders.dto.CustomerDTO;
import uk.ac.york.eng2.orders.repository.CustomerRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(transactional = false)
public class CustomerControllerTest {
    
    @Inject
    CustomerClient client;

    @Inject
    CustomerRepository customerRepo;

    @BeforeEach
    void setup() {
        customerRepo.deleteAll();
    }

    @Test
    public void noCustomersTest() {
        assertEquals(0, client.getCustomers().size());
    }

    @Test
    public void createCustomerTest() {
        long id = createCustomer("Test", "Test", "Test");
        assertEquals(1, client.getCustomers().size());
    }

    @Test
    public void getCustomerTest() {
        String fName = "firstName";
        String lName = "familyName";
        String email = "example@email.com";

        long id = createCustomer(email, fName, lName);
        Customer createdCustomer = client.getCustomer(id);

        assertNotNull(createdCustomer);
        assertEquals(fName, createdCustomer.getFirstName());
        assertEquals(lName, createdCustomer.getFamilyName());
        assertEquals(email, createdCustomer.getEmail());
        assertEquals(id, createdCustomer.getId());
    }

    @Test
    public void getCustomersTest() {
        String fName = "firstName";
        String lName = "familyName";
        String email1 = "example1@email.com";
        String email2 = "example2@email.com";

        long id1 = createCustomer(email1, fName, lName);
        long id2 = createCustomer(email2, fName, lName);
        assertEquals(2, client.getCustomers().size());
    }

    @Test
    public void updateCustomerFirstNameTest() {
        String fName = "firstName";
        String updatedFName = "updatedFirstName";
        String lName = "familyName";
        String email = "example@email.com";

        long id = createCustomer(email, fName, lName);
        Customer createdCustomer = client.getCustomer(id);
        assertEquals(fName, createdCustomer.getFirstName());

        CustomerDTO dto = new CustomerDTO();
        dto.setFirstName(updatedFName);
        client.updateCustomer(id, dto);
        Customer updatedCustomer = client.getCustomer(id);
        assertEquals(updatedFName, updatedCustomer.getFirstName());
        assertEquals(id, updatedCustomer.getId());
    }

    @Test
    public void updateCustomerFamilyNameTest() {
        String fName = "firstName";
        String lName = "familyName";
        String updatedLName = "updatedLastName";
        String email = "example@email.com";

        long id = createCustomer(email, fName, lName);
        Customer createdCustomer = client.getCustomer(id);
        assertEquals(lName, createdCustomer.getFamilyName());

        CustomerDTO dto = new CustomerDTO();
        dto.setFamilyName(updatedLName);
        client.updateCustomer(id, dto);
        Customer updatedCustomer = client.getCustomer(id);
        assertEquals(updatedLName, updatedCustomer.getFamilyName());
        assertEquals(id, updatedCustomer.getId());
    }

    @Test
    public void updateCustomerEmailTest() {
        String fName = "firstName";
        String lName = "familyName";
        String email = "example@email.com";
        String updatedEmail = "updated@email.com";

        long id = createCustomer(email, fName, lName);
        Customer createdCustomer = client.getCustomer(id);
        assertEquals(email, createdCustomer.getEmail());

        CustomerDTO dto = new CustomerDTO();
        dto.setEmail(updatedEmail);
        client.updateCustomer(id, dto);
        Customer updatedCustomer = client.getCustomer(id);
        assertEquals(updatedEmail, updatedCustomer.getEmail());
        assertEquals(id, updatedCustomer.getId());
    }

    @Test
    public void deleteCustomerTest() {
        String fName = "firstName";
        String lName = "familyName";
        String email = "example@email.com";

        long id = createCustomer(email, fName, lName);
        assertEquals(1, client.getCustomers().size());

        client.deleteCustomer(id);
        assertEquals(0, client.getCustomers().size());
    }

    private long createCustomer(String email, String fName, String lName) {
        CustomerDTO dto = new CustomerDTO();
        dto.setEmail(email);
        dto.setFirstName(fName);
        dto.setFamilyName(lName);
        HttpResponse<Void> res = client.createCustomer(dto);
        return Long.parseLong(res.header(HttpHeaders.LOCATION).split("/")[2]);
    }
}
