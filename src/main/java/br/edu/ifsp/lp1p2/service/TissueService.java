package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Tissue;
import br.edu.ifsp.lp1p2.repository.TissueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TissueService {
    
    private final TissueRepository tissueRepository;

    public List<Tissue> findAll(){
        return this.tissueRepository.findAll();
    }

    public Tissue findById(Long id){
        return this.tissueRepository.findById(id)
                .orElseThrow(() -> new GeneralException("tecido não encontrado"));
    }

    public Tissue save(Tissue tissue){
        return this.tissueRepository.save(tissue);
    }

    public void deleteById(Long id){
        this.tissueRepository.deleteById(id);
    }
}
