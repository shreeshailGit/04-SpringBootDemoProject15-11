package com.codingtips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codingtips.beans.Car;

@SpringBootApplication
public class Application {

    private Map<String,Object> cache = new HashMap<String>();
     private static final String REST_URL = "https://www.equifax.com/getScores";


       int a = 10;
	public static void main(String[] args) {
		ConfigurableApplicationContext  ctxt=SpringApplication.run(Application.class, args);
		    Car car =  ctxt.getBean(Car.class);
		   car.drive();
	}
    public void loadDataToCache(){
        //logic
   }

}
