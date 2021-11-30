package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Diet;

import java.util.List;

@Repository
public interface DietRepository extends JpaRepository <Diet, Long> {
    List<Diet> findByCategoryId(Long id);
}
