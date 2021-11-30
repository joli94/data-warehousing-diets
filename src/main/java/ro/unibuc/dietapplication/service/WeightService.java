package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.Weight;
import ro.unibuc.dietapplication.repository.WeightRepository;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeightService {
    private final WeightRepository weightRepository;

    public WeightService(WeightRepository weightRepository) {
        this.weightRepository = weightRepository;
    }

    public List<Weight> findAll(){
        return weightRepository.findAll();
    }
    //TODO: de scos, daca nu-l folosim

    public Weight findById(Long id){
        return weightRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The weight measurement with this id doesn't exist in the database!")
        );
    }

    public Weight create(Weight weight){
        weight.setDate(LocalDateTime.now());
        return weightRepository.save(weight);
    }

    public Weight update(Weight weight){
        if(weightRepository.existsById(weight.getId())){
            weight.setDate(LocalDateTime.now());
            return weightRepository.save(weight);
        } else {
            throw new EntityNotFoundException(String.format("There is no weight measurement with id=%s in the database!", weight.getId().toString()));
        }
    }
}
