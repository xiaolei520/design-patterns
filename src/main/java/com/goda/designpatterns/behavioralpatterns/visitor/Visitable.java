package com.goda.designpatterns.behavioralpatterns.visitor;

public interface Visitable {
	
	void accept(Visitor visitor);
}
