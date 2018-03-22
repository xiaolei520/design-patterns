package cn.evan.designPatterns.behavioralpatterns.memento;

/**
 * 发起人角色。
 *
 */
public class Originator {

	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 工厂方法，返回一个新的备忘录对象。
	 */
	public Memento createMemento(){
		return new Memento(state);
	}
	
	/**
	 * 将发起人恢复到备忘录对象所记载的状态。
	 */
	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}
}
