package com.goda.designpatterns.behavioralpatterns.strategy;

/**
 * <p>Implements the algorithm using the strategy interface</p>
 *
 */
public class FirstStrategy implements Strategy {

	@Override
	public void execute() {

		System.out.println("Called FirstStrategy.execute()");
	}

}
