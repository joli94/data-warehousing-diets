package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.DietGoal;

@Repository
public interface DietGoalRepository extends JpaRepository <DietGoal, Long> {
}