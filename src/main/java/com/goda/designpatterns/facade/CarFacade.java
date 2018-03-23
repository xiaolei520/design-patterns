package com.goda.designpatterns.facade;

public class CarFacade {

	Body body = new Body();
	
	public void run(){
		
		System.out.println(body.engine.EngineWork());
		for(int i=0;i<body.wheels.length;i++){
			System.out.println(body.wheels[i].wheelCircumrotate());
		}
	}
	
	public void stop(){
		
		System.out.println(body.engine.EngineStop());
		for(int i=0;i<body.wheels.length;i++){
			System.out.println(body.wheels[i].wheelStop());
		}
	}
}
