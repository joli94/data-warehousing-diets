package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Weight;

public interface WeightRepository extends JpaRepository <Weight, Long> {
}
