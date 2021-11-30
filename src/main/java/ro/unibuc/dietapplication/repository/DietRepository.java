package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Diet;

import java.util.List;

public interface DietRepository extends JpaRepository <Diet, Long> {
    List<Diet> findDietByCategoryId(Long id);
}
