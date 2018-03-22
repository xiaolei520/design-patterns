package cn.evan.designPatterns.factoryMethod;

public class MotorolaMobileFactory implements MobileFactory {

	@Override
	public Mobile produceMobile() {
		
		return new MotorolaMobile();
	}


}
