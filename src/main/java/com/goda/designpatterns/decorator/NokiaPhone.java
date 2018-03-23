package com.goda.designpatterns.decorator;

public class NokiaPhone implements CellPhone {

	@Override
	public String callNumber() {
		
		return "NokiaPhone call sombody";
	}

	@Override
	public String sendMessage() {
		
		return "NokiaPhone send a message to somebody";
	}

}
