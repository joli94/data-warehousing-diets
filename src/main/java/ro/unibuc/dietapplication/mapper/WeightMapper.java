package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.WeightDto;
import ro.unibuc.dietapplication.model.Weight;

@Mapper
public interface WeightMapper extends EntityMapper<WeightDto, Weight>{
}
