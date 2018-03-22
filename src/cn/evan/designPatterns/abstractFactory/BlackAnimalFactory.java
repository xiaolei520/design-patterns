package cn.evan.designPatterns.abstractFactory;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public Cat createCat() {
		
		return new BlackCat();
	}

	@Override
	public Dog createDog() {
		
		return new BlackDog();
	}

}
