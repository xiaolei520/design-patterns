package cn.evan.designPatterns.factoryMethod;

public class NokiaMobileFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		
		return new NokiaMobile();
	}

}
