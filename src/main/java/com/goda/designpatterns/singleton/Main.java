package com.goda.designpatterns.singleton;

public class Main {

	public static void main(String[] args){
		
		SessionFactory sessionFactory = SessionFactory.newInstanse();
		System.out.println(sessionFactory.toString());
		
		SessionFactory sessionFactory2 = SessionFactory.newInstanse();
		System.out.println(sessionFactory2.toString());
		
		SessionFactory sessionFactory3 = SessionFactory.newInstanse();
		System.out.println(sessionFactory3.toString());
	}
}
