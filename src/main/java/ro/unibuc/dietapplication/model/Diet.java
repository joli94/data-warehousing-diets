package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DIET_ID")
    private Long id;

    @Column(name = "DIET_NAME")
    private String name;

    @Column(name = "DIET_PRICE")
    private Long price;

    @Column(name = "DIET_MAXIMUM_CALORIES")
    private Long maximumCalories;

    @ManyToOne
    private Diet_type dietType;

    @ManyToOne
    private Diet_goal dietGoal;
}
