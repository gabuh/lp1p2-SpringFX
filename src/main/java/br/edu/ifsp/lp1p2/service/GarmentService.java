package br.edu.ifsp.lp1p2.service;

import br.edu.ifsp.lp1p2.exception.GeneralException;
import br.edu.ifsp.lp1p2.model.Garment;
import br.edu.ifsp.lp1p2.repository.GarmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GarmentService {

    private final GarmentRepository garmentRepository;

    public List<Garment> findAll(){
        return this.garmentRepository.findAll();
    }

    public Garment findById(Long id){
        return this.garmentRepository.findById(id)
                .orElseThrow(() -> new GeneralException("peça não encontrada"));
    }

    public Garment save(Garment garment){
        return this.garmentRepository.save(garment);
    }

    public void deleteById(Long id){
        this.garmentRepository.deleteById(id);
    }
}
