package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.Payment;
import ro.unibuc.dietapplication.repository.PaymentRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> findAll() {return paymentRepository.findAll();}

    public Payment findById(Long id){
        return paymentRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The payment with this id doesn't exist in the database!")
        );
    }

    public Payment create(Payment payment) {return paymentRepository.save(payment);}
}
