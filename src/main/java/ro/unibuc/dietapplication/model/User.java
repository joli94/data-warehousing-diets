package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "USERS")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;

    private String username;
    private String first_name;
    private String last_name;

    private LocalDate birth_date;

    @Column(columnDefinition = "varchar2(1)")
    private String gender;

    @ManyToMany
    @JoinTable(name = "USER_OPTIMUMS",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "OPTIMUM_CALORIES_ID", referencedColumnName = "OPTIMUM_CALORIES_ID")
    )
    private List<Optimum_calories> optimumCaloriesList;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Weight> weightList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Happiness> happinessList;

    @OneToOne
    private Account account;
}
