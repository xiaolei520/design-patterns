package cn.evan.designPatterns.behavioralpatterns.interpreter;

public class Main {

	public static void main(String[] args) {
		
		President president = new President();
		// 把老板叫过来让它去开发医疗系统,然后就没有总裁的事了，接下来就得老板去做了  
		president.callBoss();
		president.execute("开发医疗系统");
	}
}
