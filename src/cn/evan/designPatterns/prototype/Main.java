package cn.evan.designPatterns.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototype prototype = new ConcretePrototype("prototype");
		Prototype copy = (Prototype)prototype.clone();
		
		System.out.println(prototype.getName());
		System.out.println(copy.getName());
	}
}
