package com.goda.designpatterns.behavioralpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Command {
	
	private static List<Employee> employees = new ArrayList<Employee>();
	private Employee dba;
	private Employee docs;
	private List<Employee> tests;
	private List<Employee> engines;
	private String order;
	
	static{
		employees.add(new Employee("dba"));
		employees.add(new Employee("docs"));
		for(int i=2;i<10;i++){
			employees.add(new Employee("tests"));
		}
		for(int i=11;i<100;i++){
			employees.add(new Employee("engines"));
		}
	}
	
	/**
	 * 分配给员工任务
	 */
	public void serviceForBoss(){
		
		dba.execute(order);
		docs.execute(order);
		for(Employee test:tests){
			test.execute(order);
		}
		for(Employee engine:engines){
			engine.execute(order);
		}
	}

	@Override
	public void execute(String order) {
		
		// 老板叫同仁们开发一套医疗软件，大家努力吧  
		// 分配具体任务需求分析，概要，DB等人员分工 
		this.order = order;
		dba = employees.get(0);
		docs = employees.get(1);
		tests = employees.subList(2, 10);
		engines = employees.subList(11, 20);
		serviceForBoss();
	}

}
