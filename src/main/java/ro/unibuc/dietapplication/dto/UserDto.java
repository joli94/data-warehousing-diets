package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;

    private String username;
    private String first_name;
    private String last_name;

    private LocalDate birth_date;

    private String gender;

    private List<Optimum_caloriesDto> optimumCaloriesDtoList;

    private CityDto cityDto;

    private List<WeightDto> weightDtoList;

    private List<HappinessDto> happinessDtoList;

    private List<BillingDto> billingDtoList;

    private AccountDto accountDto;
}
