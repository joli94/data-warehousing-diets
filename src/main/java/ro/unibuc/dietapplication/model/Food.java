package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;

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

    //todo: many-to-many

    @ManyToOne
    private Food_category foodCategory;
}
