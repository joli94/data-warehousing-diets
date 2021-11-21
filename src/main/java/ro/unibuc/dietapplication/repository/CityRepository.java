package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.City;

public interface CityRepository extends JpaRepository <City, Long> {
}
