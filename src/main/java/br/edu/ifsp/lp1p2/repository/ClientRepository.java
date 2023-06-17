package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
