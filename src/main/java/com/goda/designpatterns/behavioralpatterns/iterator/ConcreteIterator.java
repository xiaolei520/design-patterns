package com.goda.designpatterns.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
	
	private List list = new ArrayList();
	private int cursor = 0;
	
	public ConcreteIterator(List list){
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		
		if(cursor == list.size()){
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		
		return this.list.get(cursor++);
	}

}
