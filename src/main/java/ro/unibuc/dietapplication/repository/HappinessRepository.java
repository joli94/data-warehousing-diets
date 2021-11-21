package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Happiness;

public interface HappinessRepository extends JpaRepository <Happiness, Long> {
}
