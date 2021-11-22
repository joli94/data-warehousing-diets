package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HappinessDto {
    private Long id;

    private LocalDate date;

    private Long value;

    private UserDto userDto;
}
