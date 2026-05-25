package com.helloworld.demo.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
/* Here if multiple beans of same class is present
we have to define one of them as primary
*/
@Component
public class SMSNotificationService implements INotification{

    @Override
    public void message(String message) {
        System.out.println("Sending SMS notification "+message);
    }
}
