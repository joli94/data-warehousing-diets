package ro.unibuc.dietapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.dietapplication.dto.PaymentDto;
import ro.unibuc.dietapplication.mapper.PaymentMapper;
import ro.unibuc.dietapplication.model.Payment;
import ro.unibuc.dietapplication.service.PaymentService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;
    private final PaymentMapper mapper;

    public PaymentController(PaymentService service, PaymentMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    //are sens sa vedem toate platile?
    @GetMapping
    public ResponseEntity<List<PaymentDto>> findAll(){
        List<Payment> response = service.findAll();
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDto> findById(@PathVariable Long id){
        Payment response = service.findById(id);
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.OK);
    }

    //TODO: vom face cautare pentru plati dupa user?

    @PostMapping
    public ResponseEntity<PaymentDto> create(@RequestBody PaymentDto request){
        Payment response = service.create(mapper.toEntity(request));
        return new ResponseEntity<>(mapper.toDto(response), HttpStatus.CREATED);
    }
}
