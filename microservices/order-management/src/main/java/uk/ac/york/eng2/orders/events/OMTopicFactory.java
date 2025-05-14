package uk.ac.york.eng2.orders.events;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Requires;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.NewTopic;

@Requires(bean = AdminClient.class)
@Factory
public class OMTopicFactory {
    public static final String ORDERS_BY_DAY_TOPIC = "orders-by-day";

    @Bean
    public NewTopic ordersByDayTopic() {
        return new NewTopic(ORDERS_BY_DAY_TOPIC, 3, (short) 1);
    }
}
