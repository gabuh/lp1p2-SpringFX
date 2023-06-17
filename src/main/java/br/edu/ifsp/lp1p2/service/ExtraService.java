package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Extra;
import br.edu.ifsp.lp1p2.repository.ExtraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExtraService {

    private final ExtraRepository extraRepository;

    public List<Extra> findAll(){
        return this.extraRepository.findAll();
    }

    public Extra findById(Long id){
        return this.extraRepository.findById(id)
                .orElseThrow(() -> new GeneralException("adicional não encontrado"));
    }

    public Extra save(Extra extra){
        return this.extraRepository.save(extra);
    }

    public void deleteById(Long id){
        this.extraRepository.deleteById(id);
    }
}
