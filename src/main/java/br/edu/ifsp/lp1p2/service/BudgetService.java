package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Budget;
import br.edu.ifsp.lp1p2.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public List<Budget> findAll(){
        return this.budgetRepository.findAll();
    }

    public Budget findById(Long id){
        return this.budgetRepository.findById(id)
                .orElseThrow(() -> new GeneralException("orçamento não encontrado"));
    }

    public Budget save(Budget budget){
        return this.budgetRepository.save(budget);
    }

    public void deleteById(Long id){
        this.budgetRepository.deleteById(id);
    }
}
