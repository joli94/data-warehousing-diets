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
public class Happiness {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="HAPPINESS_ID")
    private Long id;

    @Column(name = "HAPPINESS_DATE")
    private LocalDate date;

    @Column(name = "HAPPINESS_NUMBER")
    private Long value;

    @ManyToOne
    private User user;
}
