package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.IngredientDto;
import ro.unibuc.dietapplication.model.Ingredient;

@Mapper
public interface IngredientMapper extends EntityMapper<IngredientDto, Ingredient>{
}
