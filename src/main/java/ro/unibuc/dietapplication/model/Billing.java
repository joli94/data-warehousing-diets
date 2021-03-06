package ro.unibuc.dietapplication.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BILLING_ID")
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Diet diet;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Payment payment;
}
