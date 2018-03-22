package cn.evan.designPatterns.behavioralpatterns.state;

/**
 * 具体状态类。
 *
 */
public class ConcreteStateA implements State {

	@Override
	public void handle(String param) {
		
		System.out.println("ConcreteStateA handle: " + param);
	}

}
