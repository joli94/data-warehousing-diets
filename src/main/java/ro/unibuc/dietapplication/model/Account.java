package ro.unibuc.dietapplication.model;

import lombok.*;

import javax.persistence.*;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ACCOUNT_ID")
    private Long id;

    private String password;

    @Column(columnDefinition = "varchar2(1)")
    private String active;

    @OneToOne
    private User user;
}
