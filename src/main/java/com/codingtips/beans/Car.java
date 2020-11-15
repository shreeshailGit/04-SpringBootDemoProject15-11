package com.codingtips.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*15-11-2020
 * 
 *  author
 *  by shreeshail*/
@Component
public class Car {
    @Autowired
	private IEngine eng;
	
    public void start() {
    	//changes for HIS-122
    }
	
	/*
	 * changes for HIS-134
	 * 
	 * autowired programme for
	 *  both setter & constrctor*/
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
