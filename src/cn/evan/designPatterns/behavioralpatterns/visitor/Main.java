package cn.evan.designPatterns.behavioralpatterns.visitor;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Visitor visitor = new ConcreteVisitor();
		
		Visitable fe = new FloatElement(new Float(1.23));
		
		Visitable se = new StringElement("haha");
		
		Collection collection = new ArrayList();
		collection.add(new FloatElement(new Float(1.0)));
		collection.add(new StringElement("zhang"));
		collection.add(new FloatElement(new Float(2.0)));
		collection.add(new StringElement("lei"));
		
		fe.accept(visitor);
		
		se.accept(visitor);
		
		visitor.visitCollection(collection);
	}
}
