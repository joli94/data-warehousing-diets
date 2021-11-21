package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Billing;

public interface BillingRepository extends JpaRepository <Billing, Long> {
}
