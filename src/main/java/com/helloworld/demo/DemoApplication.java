package com.helloworld.demo;
import com.helloworld.demo.DependencyInjection.EmailNotificationService;
import com.helloworld.demo.DependencyInjection.INotification;
import com.helloworld.demo.DependencyInjection.SMSNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplication implements CommandLineRunner {
	@Autowired
	PaymentService ps;
//	@Autowired
	final INotification notification;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	// Constructor Dependency Injection
	public DemoApplication(INotification notification) {
		this.notification = notification;
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			ps.pay(1000);

			/*
			INotification notification=new SMSNotificationService();

			// Here this is not dynamic and there is tight coupling sometimes based
			// on bussiness requirement we may have to create different objects
//			INotification notification=new EmailNotificationService();
			notification.message("Heyy");
			*/

			notification.message("Hii");
		}
		catch (Exception e){
			System.out.println("Exception occured"+e);
		}
	}
}