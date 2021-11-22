package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.Diet_typeDto;
import ro.unibuc.dietapplication.model.Diet_type;

@Mapper
public interface Diet_typeMapper extends EntityMapper<Diet_typeDto, Diet_type>{
}
