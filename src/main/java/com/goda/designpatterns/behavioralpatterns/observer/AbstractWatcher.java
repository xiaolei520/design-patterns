package com.goda.designpatterns.behavioralpatterns.observer;

/**
 * 抽象观察者角色。
 *
 */
public interface AbstractWatcher {

	/**
	 * 观察到被观察者发生变化时，执行的方法。
	 */
	public void update();
}
