package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.DietTypeDto;
import ro.unibuc.dietapplication.dto.FoodCategoryDto;
import ro.unibuc.dietapplication.mapper.FoodCategoryMapper;
import ro.unibuc.dietapplication.model.FoodCategory;
import ro.unibuc.dietapplication.service.FoodCategoryService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/foodCategories")
public class FoodCategoryController {
    private final FoodCategoryService service;
    private final FoodCategoryMapper mapper;

    public FoodCategoryController(FoodCategoryService service, FoodCategoryMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<FoodCategoryDto>> findAll(){
        List<FoodCategory> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodCategoryDto> findById(@PathVariable Long id) {
        FoodCategory response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
