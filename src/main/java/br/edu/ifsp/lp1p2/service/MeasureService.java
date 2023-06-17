package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Measure;
import br.edu.ifsp.lp1p2.repository.MeasureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeasureService {

    private final MeasureRepository measureRepository;

    public List<Measure> findAll(){
        return this.measureRepository.findAll();
    }

    public Measure findById(Long id){
        return this.measureRepository.findById(id)
                .orElseThrow(() -> new GeneralException("medida não encontrada"));
    }

    public Measure save(Measure measure){
        return this.measureRepository.save(measure);
    }

    public void deleteById(Long id){
        this.measureRepository.deleteById(id);
    }
}
