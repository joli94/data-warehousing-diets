package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.DietTypeDto;
import ro.unibuc.dietapplication.model.DietType;

@Mapper
public interface DietTypeMapper extends EntityMapper<DietTypeDto, DietType>{
}
