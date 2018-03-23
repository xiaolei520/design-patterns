package com.goda.designpatterns.composite;

/**
 * <p>在组合中表示叶节点对象，叶节点对象没有子节点。</p>
 *
 */
public class Leaf implements Component {
	
	private String name;
	
	private int size;
	
	public Leaf(String name, int size){
		this.name = name;
		this.size = size;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@Override
	public int getChildNum() {
		
		return 0;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getType() {
		
		return "Leaf";
	}

	@Override
	public void add(Component c) {

		System.err.println("Not supported method!");
	}

	@Override
	public void remove(Component c) {

		System.err.println("Not supported method!");
	}

}
