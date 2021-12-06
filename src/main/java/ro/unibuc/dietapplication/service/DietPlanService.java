package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.DietPlan;
import ro.unibuc.dietapplication.repository.DietPlanRepository;

import java.util.List;

@Service
public class DietPlanService {
    private final DietPlanRepository repository;

    public DietPlanService(DietPlanRepository repository) {
        this.repository = repository;
    }

    public List<DietPlan> findByDiet(Long id){
        return repository.findByDietId(id);
    }
}
