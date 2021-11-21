package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Diet_plan;

public interface Diet_planRepository extends JpaRepository <Diet_plan, Long> {
}
