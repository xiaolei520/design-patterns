package cn.evan.designPatterns.abstractFactory;

public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public Cat createCat() {
		
		return new WhiteCat();
	}

	@Override
	public Dog createDog() {
		
		return new WhiteDog();
	}

}
