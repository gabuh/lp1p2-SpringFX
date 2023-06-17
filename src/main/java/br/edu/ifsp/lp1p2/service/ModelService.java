package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Measure;
import br.edu.ifsp.lp1p2.model.Model;
import br.edu.ifsp.lp1p2.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {

    private final ModelRepository modelRepository;

    public List<Model> findAll(){
        return this.modelRepository.findAll();
    }

    public Model findById(Long id){
        return this.modelRepository.findById(id)
                .orElseThrow(() -> new GeneralException("modelo não encontrado"));
    }

    public Model save(Model model){
        return this.modelRepository.save(model);
    }

    public void deleteById(Long id){
        this.modelRepository.deleteById(id);
    }
    
}
