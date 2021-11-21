package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Payment;

public interface PaymentRepository extends JpaRepository <Payment, Long> {
}
