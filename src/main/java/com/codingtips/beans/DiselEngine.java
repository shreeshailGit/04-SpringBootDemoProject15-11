package com.codingtips.beans;

import org.springframework.stereotype.Component;

@Component
public class DiselEngine implements IEngine {

	public DiselEngine() {
		System.out.println("**********DiselEngine 0-param constructor(dependent)");
	}
	@Override
	public int start() {
		System.out.println("**********DiselEngine.start()");
		return 10;
	}

}
