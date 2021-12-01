package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.FoodCategory;
import ro.unibuc.dietapplication.repository.FoodCategoryRepository;

import java.util.List;

@Service
public class FoodCategoryService {
    private final FoodCategoryRepository foodCategoryRepository;

    public FoodCategoryService(FoodCategoryRepository foodCategoryRepository) {
        this.foodCategoryRepository = foodCategoryRepository;
    }

    public List<FoodCategory> findAll(){
        return foodCategoryRepository.findAll();
    }

    public FoodCategory findById(Long id){
        return foodCategoryRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The food category with this id doesn't exist in the database!")
        );
    }
}
