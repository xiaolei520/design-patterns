package com.goda.designpatterns.behavioralpatterns.visitor;

import java.util.Collection;

public interface Visitor {

	void visitString(StringElement str);
	
	void visitFloat(FloatElement f);
	
	@SuppressWarnings("rawtypes")
	void visitCollection(Collection collection);
}
