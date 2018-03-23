package com.goda.designpatterns.proxy;

public class Main {

	public static void main(String[] args) {
		
		IProxy proxy = new ProxyClass();
		System.out.println(proxy.function1());
		System.out.println(proxy.function2());
	}
}
