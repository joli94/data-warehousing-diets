package ro.unibuc.dietapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unibuc.dietapplication.model.Country;

@Repository
public interface CountryRepository extends JpaRepository <Country, Long> {
}
