package com.goda.designpatterns.behavioralpatterns.state;

public class ConcreteStateC implements State {

	@Override
	public void handle(String param) {

		System.out.println("ConcreteStateC handle: " + param);
	}

}
