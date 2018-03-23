package com.goda.designpatterns.behavioralpatterns.observer;

public class ConcreteWatcher implements AbstractWatcher {

	@Override
	public void update() {
		System.out.println("update...");
	}

}
