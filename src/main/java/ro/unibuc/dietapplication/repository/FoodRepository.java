package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Food;

@Repository
public interface FoodRepository extends JpaRepository <Food, Long> {
}
