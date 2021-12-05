package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.Ingredient;
import ro.unibuc.dietapplication.repository.IngredientRepository;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findAll(){
        return ingredientRepository.findAll();
    }

    /*public List<Ingredient> findByFoodId(Long id){
        return ingredientRepository.findByFoodId(id);
    }*/

    public Ingredient findById(Long id){
        return ingredientRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The ingredient  with this id doesn't exist in the database!")
        );
    }
}
