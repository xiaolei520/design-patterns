package com.goda.designpatterns.behavioralpatterns.visitor;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visitString(StringElement se) {

		System.out.println(se.getSe());
	}

	@Override
	public void visitFloat(FloatElement fe) {

		System.out.println(fe.getFe());
	}

	/** 
	 * 在本方法中,我们实现了对Collection的元素的成功访问。
	 * 
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void visitCollection(Collection collection) {

		if(collection != null){
			Iterator iterator = collection.iterator();
			while(iterator.hasNext()){
				Object obj = iterator.next();
				if(obj instanceof Visitable){
					((Visitable)obj).accept(this);
				}
			}
		}
	}

}
