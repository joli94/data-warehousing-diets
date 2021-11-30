package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Billing;

@Repository
public interface BillingRepository extends JpaRepository <Billing, Long> {
}
