package com.goda.designpatterns.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	
	private List<Object> list = new ArrayList<Object>();

	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public Iterator iterator() {
		
		return new ConcreteIterator(list);
	}

}
