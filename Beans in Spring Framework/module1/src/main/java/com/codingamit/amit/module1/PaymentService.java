package com.codingamit.amit.module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }
    @PostConstruct
    public void afterInitaaaaa() {
        //post init logic
        System.out.println("Before paying.");
    }

    @PreDestroy
    public void beforeDestroyaaa() {
        //cleanup logic
        System.out.println("After payment is done");
    }
}
