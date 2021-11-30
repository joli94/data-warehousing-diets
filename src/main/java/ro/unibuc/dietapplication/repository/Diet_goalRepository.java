package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Diet_goal;

@Repository
public interface Diet_goalRepository extends JpaRepository <Diet_goal, Long> {
}
