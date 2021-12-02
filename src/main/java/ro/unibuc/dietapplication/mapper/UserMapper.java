package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ro.unibuc.dietapplication.dto.UserDto;
import ro.unibuc.dietapplication.model.City;
import ro.unibuc.dietapplication.model.User;

@Mapper(imports = {City.class})
public abstract class UserMapper implements EntityMapper<UserDto, User>{
    @Mappings({
            @Mapping(target = "cityId", source = "city.id")
    })
    public abstract UserDto toDto(User user);

    @Mappings({
            @Mapping(target = "city.id", source = "cityId")
    })
    public abstract User toEntity(UserDto userDto);
}
