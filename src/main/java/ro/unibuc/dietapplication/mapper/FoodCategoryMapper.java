package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.FoodCategoryDto;
import ro.unibuc.dietapplication.model.FoodCategory;

@Mapper
public interface FoodCategoryMapper extends EntityMapper<FoodCategoryDto, FoodCategory>{
}
