package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.DietTypeDto;
import ro.unibuc.dietapplication.mapper.DietTypeMapper;
import ro.unibuc.dietapplication.model.DietType;
import ro.unibuc.dietapplication.service.DietTypeService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/dietTypes")
public class DietTypeController {
    private final DietTypeService service;
    private final DietTypeMapper mapper;

    public DietTypeController(DietTypeService service, DietTypeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<DietTypeDto>> findAll(){
        List<DietType> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DietTypeDto> findById(@PathVariable Long id) {
        DietType response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
