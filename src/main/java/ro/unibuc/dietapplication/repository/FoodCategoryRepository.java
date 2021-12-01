package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.FoodCategory;

@Repository
public interface FoodCategoryRepository extends JpaRepository <FoodCategory, Long> {
}
