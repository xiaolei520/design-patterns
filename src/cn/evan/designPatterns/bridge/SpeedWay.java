package cn.evan.designPatterns.bridge;

public class SpeedWay extends AbstractRoad {

	@Override
	public void run() {
		
		car.run();
		System.out.println("高速公路上行驶！");
	}

}
