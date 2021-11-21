package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
