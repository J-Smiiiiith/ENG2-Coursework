package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.OrdersByDay;

@Repository
public interface OrdersByDayRepository extends PageableRepository<OrdersByDay, Long> {

}
