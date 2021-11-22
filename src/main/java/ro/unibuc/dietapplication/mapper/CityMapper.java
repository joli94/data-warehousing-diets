package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.CityDto;
import ro.unibuc.dietapplication.model.City;

@Mapper
public interface CityMapper extends EntityMapper<CityDto, City>{
}
