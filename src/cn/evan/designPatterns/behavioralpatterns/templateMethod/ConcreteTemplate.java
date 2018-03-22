package cn.evan.designPatterns.behavioralpatterns.templateMethod;

public class ConcreteTemplate extends Template {

	@Override
	public void print() {
		
		System.out.println("这是子类的实现！");
	}

}
