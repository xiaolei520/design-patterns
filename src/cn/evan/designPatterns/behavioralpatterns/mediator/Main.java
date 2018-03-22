package cn.evan.designPatterns.behavioralpatterns.mediator;

/**
 * 中介者模式
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Mediator mediator = new ConcreteMediator();
		
		// 老板来了
		mediator.inform("boss");
		
		// 客户来了
		mediator.inform("client");
	}
}
