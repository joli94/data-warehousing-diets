package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.DietDto;
import ro.unibuc.dietapplication.model.Diet;

@Mapper
public interface DietMapper extends EntityMapper<DietDto, Diet>{
}
