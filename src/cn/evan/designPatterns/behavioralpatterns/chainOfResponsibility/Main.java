package cn.evan.designPatterns.behavioralpatterns.chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		
		Department sales = new SalesDepartment();
		Department develop = new DevelopDepartment();
		
		sales.setSuccessor(develop);
		
		Request funcReq  = new Request(Request.RequestType.FunctionUsage);
		Request errorReq  = new Request(Request.RequestType.ProductError);
		Request otherReq  = new Request(Request.RequestType.Others);
		
		sales.handleRequest(funcReq);
		sales.handleRequest(errorReq);
		sales.handleRequest(otherReq);
	}
}
