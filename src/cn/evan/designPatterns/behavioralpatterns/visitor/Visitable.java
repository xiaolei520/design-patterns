package cn.evan.designPatterns.behavioralpatterns.visitor;

public interface Visitable {
	
	void accept(Visitor visitor);
}
