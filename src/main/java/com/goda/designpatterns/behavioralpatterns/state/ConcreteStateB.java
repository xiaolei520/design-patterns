package com.goda.designpatterns.behavioralpatterns.state;

public class ConcreteStateB implements State {

	@Override
	public void handle(String param) {

		System.out.println("ConcreteStateB handle: " + param);
	}

}
