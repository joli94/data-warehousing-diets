package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.RegistrationDto;
import ro.unibuc.dietapplication.model.Registration;

@Mapper
public interface RegistrationMapper extends EntityMapper<RegistrationDto, Registration> {
}
