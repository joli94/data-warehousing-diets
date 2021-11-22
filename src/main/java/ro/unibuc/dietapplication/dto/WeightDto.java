package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeightDto {
    private Long id;

    private LocalDate date;

    private Double value;

    private UserDto userDto;
}
