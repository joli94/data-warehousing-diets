package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.FoodIngredients;
import ro.unibuc.dietapplication.model.Ingredient;
import ro.unibuc.dietapplication.repository.FoodIngredientsRepository;

import java.util.List;

@Service
public class FoodIngredientsService {
    private final FoodIngredientsRepository foodIngredientsRepository;

    public FoodIngredientsService(FoodIngredientsRepository foodIngredientsRepository) {
        this.foodIngredientsRepository = foodIngredientsRepository;
    }

    public List<FoodIngredients> findByFoodId(Long id){
        return foodIngredientsRepository.findByFoodId(id);
    }
}
