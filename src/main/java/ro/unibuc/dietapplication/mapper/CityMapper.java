package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ro.unibuc.dietapplication.dto.CityDto;
import ro.unibuc.dietapplication.dto.DietDto;
import ro.unibuc.dietapplication.model.City;
import ro.unibuc.dietapplication.model.Country;
import ro.unibuc.dietapplication.model.Diet;

@Mapper(imports = {Country.class})
public abstract class CityMapper implements EntityMapper<CityDto, City>{
    @Mappings({
         @Mapping(target = "countryId", source = "country.id")
    })
    public abstract CityDto toDto(City city);

    @Mappings({
            @Mapping(target = "country.id", source = "countryId")
    })
    public abstract City toEntity(CityDto cityDto);
}
