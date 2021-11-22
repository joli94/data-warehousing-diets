package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Diet_typeDto {
    private Long id;

    private String name;

    private List<DietDto> dietDtoList;
}
