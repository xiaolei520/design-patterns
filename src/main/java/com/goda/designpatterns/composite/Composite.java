package com.goda.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>定义有子部件的那些部件的行为</p>
 * <p>存储子部件</p>
 * <p>在Component接口中实现与子部件有关的操作</p>
 *
 */
public class Composite implements Component {

	private String name;
	
	@SuppressWarnings("rawtypes")
	public List list;
	
	@SuppressWarnings("rawtypes")
	public Composite(String name){
		this.name = name;
		list = new ArrayList();
	}
	
	@Override
	public int getSize() {
		
		return list.size();
	}

	@Override
	public int getChildNum() {
		
		return 1;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getType() {
		
		return "Composite";
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(Component c) {
		
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		
		if(list.contains(c)){
			list.remove(c);
		}
	}

}
