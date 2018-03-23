package com.goda.designpatterns.builder;

public interface PersonBuilder {

	public void buildHead();
	
	public void buildBody();
	
	public void buildFoot();
	
	public Person buildPerson();
}
