package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends JpaRepository <Payment, Long> {
    //Optional<List<Payment>> findByUserId(Long id);
}
