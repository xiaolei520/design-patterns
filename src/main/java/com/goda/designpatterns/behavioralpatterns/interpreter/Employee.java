package com.goda.designpatterns.behavioralpatterns.interpreter;

/**
 * 员工
 *
 */
public class Employee implements Command {
	
	private String role;
	private String order;
	
	public Employee(){
		
	}
	public Employee(String role){
		this.role = role;
	}
	
	public void serviceForManager(){
		System.out.println("经理让我们：" + order + "，大家开始干活！role: " + role);
	}

	@Override
	public void execute(String order) {
		
		this.order = order;
		serviceForManager();
	}

}
