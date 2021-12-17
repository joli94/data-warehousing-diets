package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.RegistrationDto;
import ro.unibuc.dietapplication.mapper.RegistrationMapper;
import ro.unibuc.dietapplication.service.RegistrationService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/registration")
public class RegistrationController {
    private final RegistrationService service;
    private final RegistrationMapper mapper;

    public RegistrationController(RegistrationService service, RegistrationMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody RegistrationDto request){
        service.create(mapper.toEntity(request));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
