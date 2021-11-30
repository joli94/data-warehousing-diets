package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Diet_plan;

@Repository
public interface Diet_planRepository extends JpaRepository <Diet_plan, Long> {
}
