package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.DietGoalDto;
import ro.unibuc.dietapplication.model.DietGoal;

@Mapper
public interface DietGoalMapper extends EntityMapper<DietGoalDto, DietGoal>{
}
