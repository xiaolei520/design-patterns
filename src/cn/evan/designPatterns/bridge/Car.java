package cn.evan.designPatterns.bridge;

public class Car extends AbstractCar {

	@Override
	public void run() {
		
		System.out.print("小汽车在");
	}

}
