package cn.evan.designPatterns.facade;

public class Main {

	public static void main(String[] args) {
		
		CarFacade car = new CarFacade();
		car.run();
		car.stop();
	}
}
