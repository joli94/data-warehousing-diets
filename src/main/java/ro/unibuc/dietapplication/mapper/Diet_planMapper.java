package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.Diet_planDto;
import ro.unibuc.dietapplication.model.Diet_plan;

@Mapper
public interface Diet_planMapper extends EntityMapper <Diet_planDto, Diet_plan>{
}
