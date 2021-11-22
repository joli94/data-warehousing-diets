package ro.unibuc.dietapplication.dto;

import lombok.*;
import ro.unibuc.dietapplication.model.Billing;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DietDto {
    private Long id;

    private String name;

    private Long price;

    private Long maximumCalories;

    private Diet_goalDto dietGoalDto;

    private Diet_typeDto dietTypeDto;

    private List<BillingDto> billingDtoList;

    private List<Diet_planDto> dietPlanDtoList;
}
