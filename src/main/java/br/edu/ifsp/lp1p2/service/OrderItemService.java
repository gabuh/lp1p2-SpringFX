package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.OrderItem;
import br.edu.ifsp.lp1p2.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll(){
        return this.orderItemRepository.findAll();
    }

    public OrderItem findById(Long id){
        return this.orderItemRepository.findById(id)
                .orElseThrow(() -> new GeneralException("itempedido não encontrado"));
    }

    public OrderItem save(OrderItem orderItem){
        return this.orderItemRepository.save(orderItem);
    }

    public void deleteById(Long id){
        this.orderItemRepository.deleteById(id);
    }
}
