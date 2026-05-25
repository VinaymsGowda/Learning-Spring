package com.helloworld.demo;
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
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}


	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			ps.pay(1000);
		}
		catch (Exception e){
			System.out.println("Exception occured"+e);
		}
	}
}