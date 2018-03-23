package com.goda.designpatterns.behavioralpatterns.strategy;

/**
 * <p>Configured with a ConcreteStrategy object and maintains a reference to a Strategy object.</p>
 *
 */
public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void execute(){
		strategy.execute();
	}
}
