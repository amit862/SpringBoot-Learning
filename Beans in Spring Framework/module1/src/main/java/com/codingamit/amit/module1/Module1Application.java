package com.codingamit.amit.module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {
@Autowired
    PaymentService paymentServiceObj;
    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        paymentServiceObj.pay();
    }
}
