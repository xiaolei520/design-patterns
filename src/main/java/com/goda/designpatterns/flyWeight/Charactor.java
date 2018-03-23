package com.goda.designpatterns.flyWeight;

public abstract class Charactor {

	protected char letter;
	
	protected int fontSize;
	
	public abstract void display();
	
	public abstract void setFontSize(int fontSize);
}
