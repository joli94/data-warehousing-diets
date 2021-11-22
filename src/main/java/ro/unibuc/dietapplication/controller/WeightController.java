package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.WeightDto;
import ro.unibuc.dietapplication.exception.BadRequestException;
import ro.unibuc.dietapplication.mapper.WeightMapper;
import ro.unibuc.dietapplication.model.Weight;
import ro.unibuc.dietapplication.service.WeightService;

import java.util.List;

@RestController
@RequestMapping("/weights")
public class WeightController {
    private final WeightService service;
    private final WeightMapper mapper;

    public WeightController(WeightService service, WeightMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<WeightDto>> findAll(){
        List<Weight> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WeightDto> findById(@PathVariable Long id){
        Weight response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WeightDto> create(@RequestBody WeightDto request){
        Weight response = service.create(mapper.toEntity(request));
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WeightDto> update(@PathVariable Long id, @RequestBody WeightDto request) {
        if (id != request.getId()) {
            throw new BadRequestException("The path variable doesn't match the request body id!");
        }

        Weight response = service.update(mapper.toEntity(request));
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }
}
