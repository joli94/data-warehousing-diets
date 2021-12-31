package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.FoodIngredients;
import ro.unibuc.dietapplication.model.Ingredient;
import ro.unibuc.dietapplication.repository.IngredientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository ingredientRepository;
    private final FoodIngredientsService foodIngredientsService;

    public IngredientService(IngredientRepository ingredientRepository, FoodIngredientsService foodIngredientsRepository) {
        this.ingredientRepository = ingredientRepository;
        this.foodIngredientsService = foodIngredientsRepository;
    }

    public List<Ingredient> findAll(){
        return ingredientRepository.findAll();
    }

    public List<Ingredient> findByFoodId(Long id){
        List<Ingredient> ingredientList = new ArrayList<>();
        List<FoodIngredients> result =  foodIngredientsService.findByFoodId(id);

        result.forEach((foodIngredients) -> ingredientList.add(findById(foodIngredients.getId())));

        return ingredientList;
    }

    public Ingredient findById(Long id){
        return ingredientRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The ingredient  with this id doesn't exist in the database!")
        );
    }
}
