package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.PaymentDto;
import ro.unibuc.dietapplication.model.Payment;

@Mapper
public interface PaymentMapper extends EntityMapper<PaymentDto, Payment>{
}
