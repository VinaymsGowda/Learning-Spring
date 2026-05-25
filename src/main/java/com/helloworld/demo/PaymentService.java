package com.helloworld.demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    String provider;

    public PaymentService(String provider) {
        this.provider = provider;
    }

    public void pay(int amount){
        System.out.println("Provider "+provider);
        System.out.println("Paying amount "+amount);
    }
}
