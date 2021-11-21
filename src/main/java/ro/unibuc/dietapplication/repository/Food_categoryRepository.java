package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Food_category;

public interface Food_categoryRepository extends JpaRepository <Food_category, Long> {
}
