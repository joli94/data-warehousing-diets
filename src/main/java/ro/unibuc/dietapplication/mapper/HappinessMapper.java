package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.HappinessDto;
import ro.unibuc.dietapplication.model.Happiness;

@Mapper
public interface HappinessMapper extends EntityMapper<HappinessDto, Happiness>{
}
