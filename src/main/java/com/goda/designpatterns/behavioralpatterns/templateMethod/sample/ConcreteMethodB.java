package com.goda.designpatterns.behavioralpatterns.templateMethod.sample;

public class ConcreteMethodB extends AbstractMethod {

	@Override
	protected void method1() {

		System.out.println("子类 B ：method1() ..."); 
	}

	@Override
	protected void method2() {

		System.out.println("子类 B ：method2() ...");
	}
	
	//覆盖钩子方法 
	@Override
	protected boolean hookMethod() { 
	    return false; 
	} 

}
