package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.UserDto;
import ro.unibuc.dietapplication.model.User;

@Mapper
public interface UserMapper extends EntityMapper <UserDto, User>{
}
