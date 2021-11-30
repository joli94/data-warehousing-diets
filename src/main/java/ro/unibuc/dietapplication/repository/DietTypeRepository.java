package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.DietType;

@Repository
public interface DietTypeRepository extends JpaRepository <DietType, Long> {
}
