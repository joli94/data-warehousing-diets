package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
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

    public List<Diet> findByGoalId(Long id) { return dietRepository.findByDietGoalId(id); }

    public List<Diet> findByTypeId(Long id) { return dietRepository.findByDietTypeId(id); }

    public Diet findById(Long id) { return dietRepository.findById(id).orElseThrow(
            ()-> new EntityNotFoundException("The diet with this id doesn't exist in the database!")
    );
    }
}
