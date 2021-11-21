package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Diet;

public interface DietRepository extends JpaRepository <Diet, Long> {
}
