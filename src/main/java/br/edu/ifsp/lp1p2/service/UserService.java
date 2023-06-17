package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.User;
import br.edu.ifsp.lp1p2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public User findById(Long id){
        return this.userRepository.findById(id)
                .orElseThrow(() -> new GeneralException("usuário não encontrado"));
    }

    public User findByEmail(String email){
        return this.userRepository.findByEmail(email);
    }

    public User save(User user){
        return this.userRepository.save(user);
    }

    public void deleteById(Long id){
        this.userRepository.deleteById(id);
    }
}
