package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.Garment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarmentRepository extends JpaRepository<Garment, Long> {
}
