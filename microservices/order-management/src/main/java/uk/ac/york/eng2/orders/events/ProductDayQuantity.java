package uk.ac.york.eng2.orders.events;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record ProductDayQuantity(long productId, String day, int quantity) {
}
