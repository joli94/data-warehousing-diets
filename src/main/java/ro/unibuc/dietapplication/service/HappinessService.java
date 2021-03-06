package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.Happiness;
import ro.unibuc.dietapplication.repository.HappinessRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HappinessService {
    private final HappinessRepository happinessRepository;

    public HappinessService(HappinessRepository happinessRepository) {
        this.happinessRepository = happinessRepository;
    }

    public List<Happiness> findAll(){
        return  happinessRepository.findAll();
    }
    //TODO: de scos, daca nu-l folosim

    public List<Happiness> findByUserId(Long id){
        return  happinessRepository.findByUserId(id);
    }

    public Happiness findById(Long id){
        return happinessRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The happiness measurement with this id doesn't exist in the database!")
        );
    }

    public Happiness create(Happiness happiness){
        happiness.setDate(LocalDateTime.now());
        return happinessRepository.save(happiness);
    }

    public Happiness update(Happiness happiness){
        if(happinessRepository.existsById(happiness.getId())){
            happiness.setDate(LocalDateTime.now());
            return happinessRepository.save(happiness);
        } else {
            throw new EntityNotFoundException(String.format("There is no happiness measurement with id=%s in the database!", happiness.getId().toString()));
        }
    }
}
