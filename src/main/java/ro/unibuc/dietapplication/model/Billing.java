package ro.unibuc.dietapplication.model;

import javax.persistence.*;

@Entity
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BILLING_ID")
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Diet diet;

    @OneToOne
    private Payment payment;
}
