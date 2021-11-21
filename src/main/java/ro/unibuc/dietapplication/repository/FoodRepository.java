package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Food;

public interface FoodRepository extends JpaRepository <Food, Long> {
}
