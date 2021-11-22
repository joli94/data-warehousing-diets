package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.FoodDto;
import ro.unibuc.dietapplication.model.Food;

@Mapper
public interface FoodMapper extends EntityMapper<FoodDto, Food>{
}
