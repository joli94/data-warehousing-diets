package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ro.unibuc.dietapplication.dto.FoodDto;
import ro.unibuc.dietapplication.model.Food;
import ro.unibuc.dietapplication.model.FoodCategory;

@Mapper(imports = {FoodCategory.class})
public abstract class FoodMapper implements EntityMapper<FoodDto, Food>{
    @Mappings({
            @Mapping(target = "foodCategoryId", source = "foodCategory.id")
    })
    public abstract FoodDto toDto(Food food);

    @Mappings({
            @Mapping(target = "foodCategory.id", source = "foodCategoryId")
    })
    public abstract Food toEntity(FoodDto foodDto);
}
