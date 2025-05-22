package uk.ac.york.eng2.products.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.products.domain.OrdersByDay;
import uk.ac.york.eng2.products.domain.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersByDayRepository extends PageableRepository<OrdersByDay, Long> {
    public Optional<OrdersByDay> findByProductIdAndDay(long productId, String day);
    public List<Integer> getCountByDay(String day);
}