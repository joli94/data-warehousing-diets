package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.FoodDto;
import ro.unibuc.dietapplication.mapper.FoodMapper;
import ro.unibuc.dietapplication.model.Food;
import ro.unibuc.dietapplication.service.FoodService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/foods")
public class FoodController {
    private final FoodService service;
    private final FoodMapper mapper;

    public FoodController(FoodService service, FoodMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<FoodDto>> findAll(){
        List<Food> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<FoodDto>> findByCategory(@RequestParam Long id){
        List<Food> response = service.findByFoodCategory(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/diet")
    public ResponseEntity<List<FoodDto>> findByDiet(@RequestParam Long id){
        List<Food> response = service.findByDiet(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodDto> findById(@PathVariable Long id){
        Food response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
