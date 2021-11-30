package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.Diet;
import ro.unibuc.dietapplication.repository.DietRepository;
import java.util.List;

@Service
public class DietService {

    private final DietRepository dietRepository;

    public DietService(DietRepository dietRepository) {
        this.dietRepository = dietRepository;
    }

    public List<Diet> findAll(){
        return dietRepository.findAll();
    }

    public List<Diet> findByCategoryId(Long id){ return dietRepository.findByCategoryId(id); }
}
