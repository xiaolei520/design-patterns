package cn.evan.designPatterns.behavioralpatterns.state;

public class Main {

	public static void main(String[] args) {
		
		// 创建环境
		Context context = new Context();
		
		// 创建状态
		State stateB = new ConcreteStateB();
		
		// 将状态设置到环境中
		context.setState(stateB);
		
		// 请求
		context.request("test");
		
		State stateA = new ConcreteStateA();
		
		context.setState(stateA);
		context.request("test");
	}
}
