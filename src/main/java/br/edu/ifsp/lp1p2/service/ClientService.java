package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Client;
import br.edu.ifsp.lp1p2.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> findAll(){
        return this.clientRepository.findAll();
    }

    public Client findById(Long id){
        return this.clientRepository.findById(id)
                .orElseThrow(() -> new GeneralException("cliente não encontrado"));
    }

    public Client save(Client client){
        return this.clientRepository.save(client);
    }

    public void deleteById(Long id){
        this.clientRepository.deleteById(id);
    }
}
