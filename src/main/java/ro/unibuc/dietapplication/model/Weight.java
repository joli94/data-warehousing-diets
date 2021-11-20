package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Weight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="WEIGHT_ID")
    private Long id;

    @Column(name = "WEIGHT_DATE")
    private LocalDate date;

    @Column(name = "WEIGHT_NUMBER")//TODO:de facut cu zecimale
    private Double value;

    @ManyToOne
    private User user;
}
