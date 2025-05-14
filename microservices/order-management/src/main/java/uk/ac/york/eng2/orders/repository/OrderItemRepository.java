package uk.ac.york.eng2.orders.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;
import uk.ac.york.eng2.orders.domain.OrderItem;

import java.util.List;

@Repository
public interface OrderItemRepository extends PageableRepository<OrderItem, Long> {
    OrderItem findByProductIdAndOrderId(Long productId, Long orderId);
    List<OrderItem> findAllByOrderId(Long orderId);
}
