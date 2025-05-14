package uk.ac.york.eng2.orders.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

public interface OrdersByDayProducer {

    @Topic(OMTopicFactory.ORDERS_BY_DAY_TOPIC)
    void orderPlaced(@KafkaKey long orderId, ProductDayQuantity productDayQuantity);
}
