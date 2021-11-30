package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Weight;

import java.util.List;

public interface WeightRepository extends JpaRepository <Weight, Long> {
    List<Weight> findByUserId(Long id);
}
