package com.goda.designpatterns.facade;

public class Body {

	public Engine engine = new Engine();
	
	public Wheel[] wheels = new Wheel[4];
	
	public Body(){
		for(int i=0;i<4;i++){
			wheels[i] = new Wheel();
		}
	}
}
