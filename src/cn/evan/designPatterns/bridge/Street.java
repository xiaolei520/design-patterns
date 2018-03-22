package cn.evan.designPatterns.bridge;

public class Street extends AbstractRoad {

	@Override
	public void run() {
		
		car.run();
		System.out.println("市区街道上行驶！");
	}

}
