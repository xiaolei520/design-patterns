package com.goda.designpatterns.behavioralpatterns.strategy;

public class SecondStrategy implements Strategy {

	@Override
	public void execute() {

		System.out.println("Called SecondStrategy.execute()");
	}

}
