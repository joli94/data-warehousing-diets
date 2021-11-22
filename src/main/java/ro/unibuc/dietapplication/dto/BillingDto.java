package ro.unibuc.dietapplication.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillingDto {
    private Long id;

    private UserDto userDto;

    private DietDto dietDto;

    private PaymentDto paymentDto;
}
