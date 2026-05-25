package com.helloworld.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    /*
    * Here we are using new keyword because developer is
    *  providing config values for creating object so spring framework can use this
    * config values when creating a Bean in IOC container.
    * */
    @Bean
    PaymentService paymentService(){
        // You can add more logic based on requirements.
        return new PaymentService("Razorpay");
    }
}
