package com.goda.designpatterns.behavioralpatterns.templateMethod.sample;

public class ConcreteMethodA extends AbstractMethod {

	@Override
	protected void method1() {

		System.out.println("子类 A ：method1() ..."); 
	}

	@Override
	protected void method2() {

		System.out.println("子类 A ：method2() ..."); 
	}

}
