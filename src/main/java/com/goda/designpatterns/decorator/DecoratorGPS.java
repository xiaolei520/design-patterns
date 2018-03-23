package com.goda.designpatterns.decorator;

public class DecoratorGPS extends Decorator {

	public DecoratorGPS(CellPhone cellPhone) {
		super(cellPhone);
	}
	
	@Override
	public String callNumber() {
		
		// 增加GPS功能 
		return super.callNumber() + " with GPS";
	}
	
	@Override
	public String sendMessage() {
		
		// 增加GPS功能 
		return super.sendMessage() + " with GPS";
	}

}
