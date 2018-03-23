package com.goda.designpatterns.factoryMethod;

public class NokiaMobileFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		
		return new NokiaMobile();
	}

}
