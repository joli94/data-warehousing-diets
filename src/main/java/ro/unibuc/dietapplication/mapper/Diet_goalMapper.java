package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.Diet_goalDto;
import ro.unibuc.dietapplication.model.Diet_goal;

@Mapper
public interface Diet_goalMapper extends EntityMapper<Diet_goalDto, Diet_goal>{
}
