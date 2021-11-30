package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DietDto {
    private Long id;

    private String name;

    private long price;

    private long maximumCalories;

    private byte[] image;

    private DietGoalDto dietGoalDto;

    private DietTypeDto dietTypeDto;

    private List<BillingDto> billingDtoList;

    private List<Diet_planDto> dietPlanDtoList;
}
