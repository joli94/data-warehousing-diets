package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.BillingDto;
import ro.unibuc.dietapplication.model.Billing;

@Mapper
public interface BillingMapper extends EntityMapper<BillingDto, Billing>{
}
