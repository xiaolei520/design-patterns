package com.goda.designpatterns.bridge;

public class Bus extends AbstractCar {

	@Override
	public void run() {
		
		System.out.print("公交车在");
	}

}
