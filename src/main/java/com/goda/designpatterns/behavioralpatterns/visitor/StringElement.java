package com.goda.designpatterns.behavioralpatterns.visitor;

public class StringElement implements Visitable {
	
	private String se;
	
	public StringElement(String se) {
		this.se = se;
	}

	public String getSe() {
		return se;
	}

	public void setSe(String se) {
		this.se = se;
	}

	@Override
	public void accept(Visitor visitor) {

		visitor.visitString(this);
	}

}
