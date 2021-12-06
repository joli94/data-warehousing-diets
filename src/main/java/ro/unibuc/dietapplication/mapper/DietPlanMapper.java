package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.DietPlanDto;
import ro.unibuc.dietapplication.model.DietPlan;

@Mapper
public interface DietPlanMapper extends EntityMapper <DietPlanDto, DietPlan>{
}
