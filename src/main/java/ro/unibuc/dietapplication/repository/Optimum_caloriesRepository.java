package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Optimum_calories;

@Repository
public interface Optimum_caloriesRepository extends JpaRepository <Optimum_calories, Long> {
}
