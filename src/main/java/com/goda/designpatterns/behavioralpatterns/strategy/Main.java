package com.goda.designpatterns.behavioralpatterns.strategy;

public class Main {

	public static void main(String[] args) {
		
		// Three contexts following different strategies
		Context context1 = new Context(new SecondStrategy());
		context1.execute();
		
		Context context2 = new Context(new FirstStrategy());
		context2.execute();
		
		Context context3 = new Context(new ThirdStrategy());
		context3.execute();
	}
}
