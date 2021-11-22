package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.BillingDto;
import ro.unibuc.dietapplication.mapper.BillingMapper;
import ro.unibuc.dietapplication.model.Billing;
import ro.unibuc.dietapplication.service.BillingService;

@RestController
@RequestMapping("/billings")
public class BillingController {
    private final BillingService service;
    private final BillingMapper mapper;

    public BillingController(BillingService service, BillingMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillingDto> findById(@PathVariable Long id){
        Billing response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BillingDto> create(@RequestBody BillingDto request){
        Billing response = service.create(mapper.toEntity(request));
        return  new ResponseEntity<>(mapper.toDto(response), HttpStatus.CREATED);
    }
}
