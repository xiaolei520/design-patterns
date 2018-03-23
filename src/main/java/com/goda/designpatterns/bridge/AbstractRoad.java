package com.goda.designpatterns.bridge;

/**
 * <p>抽象路。</p>
 *
 */
public abstract class AbstractRoad {

	protected AbstractCar car;
	
	public abstract void run();
}
