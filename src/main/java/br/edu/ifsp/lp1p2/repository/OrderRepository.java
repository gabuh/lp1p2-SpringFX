package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
