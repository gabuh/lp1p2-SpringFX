package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Order;
import br.edu.ifsp.lp1p2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> findAll(){
        return this.orderRepository.findAll();
    }

    public Order findById(Long id){
        return this.orderRepository.findById(id)
                .orElseThrow(() -> new GeneralException("pedido não encontrado"));
    }

    public Order save(Order order){
        return this.orderRepository.save(order);
    }

    public void deleteById(Long id){
        this.orderRepository.deleteById(id);
    }
}
