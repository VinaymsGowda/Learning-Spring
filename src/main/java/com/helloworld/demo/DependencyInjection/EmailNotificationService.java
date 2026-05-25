package com.helloworld.demo.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements INotification{


    @Override
    public void message(String message) {
        System.out.println("Sending Email message "+message);
    }
}
