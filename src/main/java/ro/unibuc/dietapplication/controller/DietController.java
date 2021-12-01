package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.DietDto;
import ro.unibuc.dietapplication.exception.BadRequestException;
import ro.unibuc.dietapplication.mapper.DietMapper;
import ro.unibuc.dietapplication.model.Diet;
import ro.unibuc.dietapplication.service.DietService;
import ro.unibuc.dietapplication.service.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/diets")
public class DietController {
    private final DietService service;
    private final DietMapper mapper;

    public DietController(DietMapper mapper, DietService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DietDto>> findAll(){
        List<Diet> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

   @GetMapping("/goal")
    public ResponseEntity<List<DietDto>> findByGoal(@RequestParam Long id){
        List<Diet> response = service.findByGoalId(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<DietDto>> findByType(@RequestParam Long id){
        List<Diet> response = service.findByTypeId(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DietDto> findById(@PathVariable Long id){
        Diet response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

}
