package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.dietapplication.model.Country;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
