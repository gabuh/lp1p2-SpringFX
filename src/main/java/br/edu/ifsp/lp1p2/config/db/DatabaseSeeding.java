package br.edu.ifsp.lp1p2.config.db;

import br.edu.ifsp.lp1p2.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeding implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("user1@email.com");
        user.setName("gabriel");
        user.setPassword("123");
    }
}
