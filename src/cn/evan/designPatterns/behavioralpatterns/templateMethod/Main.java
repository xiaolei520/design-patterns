package cn.evan.designPatterns.behavioralpatterns.templateMethod;

public class Main {

	public static void main(String[] args) {
		
		Template template = new ConcreteTemplate();
		template.update();
	}
}
