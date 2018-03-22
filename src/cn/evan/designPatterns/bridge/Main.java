package cn.evan.designPatterns.bridge;

public class Main {

	public static void main(String[] args) {
		
		// case one
		AbstractRoad aRoad = new Street();
		aRoad.car = new Car();
		aRoad.run();
		
		// case two
		AbstractRoad aRoad2 = new SpeedWay();
		aRoad2.car = new Bus();
		aRoad2.run();
	}
}
