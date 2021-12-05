package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INGREDIENT_ID")
    private Long id;

    @Column(name = "INGREDIENT_NAME")
    private String name;

    @Column(name = "INGREDIENT_CALORIES")
    private Long calories;

    @ManyToMany
    @JoinTable(name = "FOOD_INGREDIENTS",
            joinColumns = @JoinColumn(name = "INGREDIENT_ID", referencedColumnName = "INGREDIENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "FOOD_ID", referencedColumnName = "FOOD_ID")
    )
    private List<Food> foodList;
}
