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
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FOOD_ID")
    private Long id;

    @Column(name = "FOOD_NAME")
    private String name;

    @Column(name = "FOOD_CALORIES")
    private Long calories;

    @OneToMany(mappedBy = "food", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<FoodIngredients> foodIngredientsList;

    @ManyToOne
    private FoodCategory foodCategory;

    @OneToMany(mappedBy = "food", cascade = CascadeType.PERSIST)
    private List<Diet_plan> dietPlanList;
}
