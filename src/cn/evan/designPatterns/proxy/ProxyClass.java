package cn.evan.designPatterns.proxy;

public class ProxyClass implements IProxy {

	@Override
	public String function1() {
		
		// do something or not
		IProxy remoteClass = new RemoteClass();
		String middle = remoteClass.function1();
		
		// do something to middle or not
		return middle;
	}

	@Override
	public String function2() {
		
		// do something or not
		IProxy remoteClass = new RemoteClass();
		String middle = remoteClass.function2();
		
		// do something to middle or not
		return middle;
	}

}
