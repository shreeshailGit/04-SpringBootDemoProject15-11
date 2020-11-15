package com.codingtips.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
    @Autowired
	private IEngine eng;
	
	
	
	/*public Car(IEngine eng) {
		this.eng=eng;
		System.out.println("**********Car 1-param constructor(target)");
	}*/

	
	/*@Autowired
	public void setEng(IEngine eng) {
		this.eng=eng;
	  System.out.println("**********Car.setEngin()-setter method");
	}*/
	
	public void drive() {
		int status = eng.start();
		if(status!=0) {
			System.out.println("*********Journey Started************");
		}
	}
	
	
}//class
