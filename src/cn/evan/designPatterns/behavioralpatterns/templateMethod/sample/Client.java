package cn.evan.designPatterns.behavioralpatterns.templateMethod.sample;

public class Client {

	 public static void main(String[] args) { 
		    AbstractMethod methodA = new ConcreteMethodA(); 
		    methodA.templateMethod(); 
		     
		    AbstractMethod methodB= new ConcreteMethodB(); 
		    methodB.templateMethod(); 
	 } 
}
