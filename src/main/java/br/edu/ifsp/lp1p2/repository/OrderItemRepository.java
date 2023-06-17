package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
