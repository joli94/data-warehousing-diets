package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.Food;
import ro.unibuc.dietapplication.repository.FoodRepository;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAll(){
        return foodRepository.findAll();
    }

    public List<Food> findByFoodCategory(Long id){
        return foodRepository.findByFoodCategoryId(id);
    }

    public Food findById(Long id){
        return foodRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The food with this id doesn't exist in the database!")
        );
    }
}
