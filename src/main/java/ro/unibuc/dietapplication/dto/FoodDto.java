package ro.unibuc.dietapplication.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodDto {
    private Long id;

    private String name;

    private Long calories;

    private Long foodCategoryId;
}
