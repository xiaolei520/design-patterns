package cn.evan.designPatterns.behavioralpatterns.observer;

public class ConcreteWatcher implements AbstractWatcher {

	@Override
	public void update() {
		System.out.println("update...");
	}

}
