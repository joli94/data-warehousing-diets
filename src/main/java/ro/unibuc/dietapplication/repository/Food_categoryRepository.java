package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Food_category;

@Repository
public interface Food_categoryRepository extends JpaRepository <Food_category, Long> {
}
