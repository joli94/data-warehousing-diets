package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.Optimum_caloriesDto;
import ro.unibuc.dietapplication.model.Optimum_calories;

@Mapper
public interface Optimum_caloriesMapper extends EntityMapper<Optimum_caloriesDto, Optimum_calories>{
}
