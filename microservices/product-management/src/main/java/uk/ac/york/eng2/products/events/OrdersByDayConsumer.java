package uk.ac.york.eng2.products.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;

@KafkaListener(
        groupId="orders-by-day",
        threads = 3,
        offsetReset = OffsetReset.EARLIEST
)
public class OrdersByDayConsumer {
    @Inject
    OrdersByDayRepository OBDRepo;

    @Inject
    ProductRepository prodRepo;

    @Transactional
    @Topic(OrdersByDayTopics.ORDERS_BY_DAY_TOPIC)
    public void productAddedToOrder(@KafkaKey long orderId, ProductDayQuantity productDayQuantity) {
        System.out.println("Record received: " + orderId + ": " + productDayQuantity);
        OrdersByDay ordersByDay = OBDRepo.findByProductIdAndDay(productDayQuantity.productId(), productDayQuantity.day())
                .orElse(null);
        if (ordersByDay == null) {
            Product product = prodRepo.findById(productDayQuantity.productId()).orElse(null);
            if (product == null) {
                throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
            }
            ordersByDay = new OrdersByDay();
            ordersByDay.setProduct(product);
            ordersByDay.setDay(productDayQuantity.day());
            ordersByDay.setCount(productDayQuantity.quantity());
            OBDRepo.save(ordersByDay);
        } else {
            ordersByDay.setCount(ordersByDay.getCount() + productDayQuantity.quantity());
            OBDRepo.update(ordersByDay);
        }
    }
}
