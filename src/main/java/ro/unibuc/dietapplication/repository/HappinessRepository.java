package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Happiness;
import ro.unibuc.dietapplication.model.Weight;

import java.util.List;

@Repository
public interface HappinessRepository extends JpaRepository <Happiness, Long> {
    List<Happiness> findByUserId(Long id);
}
