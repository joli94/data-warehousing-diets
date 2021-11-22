package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.Food_categoryDto;
import ro.unibuc.dietapplication.model.Food_category;

@Mapper
public interface Food_categoryMapper extends EntityMapper<Food_categoryDto, Food_category>{
}
