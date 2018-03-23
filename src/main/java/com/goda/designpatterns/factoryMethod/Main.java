package com.goda.designpatterns.factoryMethod;

public class Main {

	public static void main(String[] args) {
		
		MobileFactory workFactory = new MotorolaMobileFactory();
		workFactory.produceMobile().call();
	}
}
