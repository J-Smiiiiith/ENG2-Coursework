package uk.ac.york.eng2.products.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Serdeable
public class ProductTag {
    @Id
    @GeneratedValue
    private long id;
}
