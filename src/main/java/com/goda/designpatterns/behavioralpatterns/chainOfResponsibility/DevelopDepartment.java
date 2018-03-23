package com.goda.designpatterns.behavioralpatterns.chainOfResponsibility;

/**
 * 开发部门<br>
 *
 */
public class DevelopDepartment extends Department{

	@Override
	public void handleRequest(Request request) {
		
		/* 判断请求的类型来决定哪种请求来自己处理，哪种抛给Successor */
		if(request.getType() == Request.RequestType.ProductError){
			System.out.println("DevelopDepartment: The request is handled here.");
		}else if(getSuccessor() != null){
			getSuccessor().handleRequest(request);
		}else{
			System.out.println("The request cannot be handled");
		}
	}

}
