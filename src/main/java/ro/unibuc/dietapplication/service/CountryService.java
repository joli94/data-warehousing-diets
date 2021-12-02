package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.Country;
import ro.unibuc.dietapplication.repository.CountryRepository;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public Country findById(Long id){
        return countryRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The country with this id doesn't exist in the database!")
        );
    }
}
