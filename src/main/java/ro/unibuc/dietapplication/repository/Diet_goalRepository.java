package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Diet_goal;

public interface Diet_goalRepository extends JpaRepository <Diet_goal, Long> {
}
