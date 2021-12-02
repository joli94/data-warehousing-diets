package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.exception.EntityNotFoundException;
import ro.unibuc.dietapplication.model.City;
import ro.unibuc.dietapplication.repository.CityRepository;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> findAll(){
        return cityRepository.findAll();
    }

    public List<City> findByCountryId(Long id){
        return cityRepository.findByCountryId(id);
    }

    public City findById(Long id){
        return cityRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The city with this id doesn't exist in the database!")
        );
    }
}
