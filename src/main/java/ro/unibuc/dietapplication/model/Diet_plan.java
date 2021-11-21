package ro.unibuc.dietapplication.model;

import javax.persistence.*;

@Entity
public class Diet_plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DIET_PLAN_ID")
    private Long id;

    @ManyToOne
    private Diet diet;

    @ManyToOne
    private Food food;
}
