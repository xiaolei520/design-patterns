package com.goda.designpatterns.proxy;

public class RemoteClass implements IProxy {

	@Override
	public String function1() {
		
		return "Invoke remoteClass.function1";
	}

	@Override
	public String function2() {
		
		return "Invoke remoteClass.function2";
	}

}
