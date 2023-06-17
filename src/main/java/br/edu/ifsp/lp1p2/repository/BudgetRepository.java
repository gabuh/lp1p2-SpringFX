package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
