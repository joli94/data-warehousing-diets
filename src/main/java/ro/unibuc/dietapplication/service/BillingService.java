package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.Billing;
import ro.unibuc.dietapplication.repository.BillingRepository;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class BillingService {
    private final BillingRepository billingRepository;

    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    public Billing findById(Long id){
        return billingRepository.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("The billing with this id doesn't exist in the database!")
        );
    }
    public Billing create(Billing billing){
        billing.getPayment().setDate(LocalDate.now());
        return billingRepository.save(billing);
    }
}
