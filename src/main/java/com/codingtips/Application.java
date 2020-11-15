package com.codingtips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codingtips.beans.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctxt=SpringApplication.run(Application.class, args);
		    Car car =  ctxt.getBean(Car.class);
		   car.drive();
	}

}
