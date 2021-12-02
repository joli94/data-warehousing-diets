package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.City;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository <City, Long> {
    List<City> findByCountryId(Long id);
}
