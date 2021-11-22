package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDto {
    private Long id;

    private String name;

    //TODO:validare
    private String code;

   private List<CityDto> cityDtoList;
}
