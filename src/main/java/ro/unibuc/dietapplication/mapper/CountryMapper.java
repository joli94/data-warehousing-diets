package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.CountryDto;
import ro.unibuc.dietapplication.model.Country;

@Mapper
public interface CountryMapper extends EntityMapper<CountryDto, Country>{
}
