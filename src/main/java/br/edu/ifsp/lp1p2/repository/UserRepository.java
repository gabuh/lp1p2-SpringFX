package br.edu.ifsp.lp1p2.repository;

import br.edu.ifsp.lp1p2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
