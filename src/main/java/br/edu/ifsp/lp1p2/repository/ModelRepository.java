package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
