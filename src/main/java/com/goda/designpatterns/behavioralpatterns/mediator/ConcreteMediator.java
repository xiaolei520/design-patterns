package com.goda.designpatterns.behavioralpatterns.mediator;

public class ConcreteMediator extends Mediator {
	
	private Colleague colleagueA = null;
	
	private Colleague colleagueB = null;
	
	public ConcreteMediator(){
		colleagueA = new ColleagueA();
		colleagueB = new ColleagueB();
	}

	@Override
	public void inform(String content) {
		
		// 老板来了, 通知员工A
		if("boss".equals(content)){
			colleagueA.action();
			
		// 客户来了, 通知前台B
		}else if("client".equals(content)){
			colleagueB.action();
		}
	}

}
