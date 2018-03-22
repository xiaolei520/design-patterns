package cn.evan.designPatterns.behavioralpatterns.memento;

public class Main {
	
	private static Originator originator = new Originator();
	
	private static Caretaker caretaker = new Caretaker();

	public static void main(String[] args) {
		
		// amigo当前的状态
		originator.setState("不爱打扮，做事拖拖拉拉，十足马大哈");
		
		// 保存amigo当前的状态
		caretaker.saveMemento(originator.createMemento());
		
		// mother要对amigo进行改造
		originator.setState("做事精炼");
		
		// mother发现改造后产生了很多副作用,于是反悔了,要恢复女儿以前的样子
		originator.restoreMemento(caretaker.retrieveMemento());
		
		// amigo被打回原型,^_^
		System.out.println(originator.getState());
	}
}
