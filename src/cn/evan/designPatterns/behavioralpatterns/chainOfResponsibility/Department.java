package cn.evan.designPatterns.behavioralpatterns.chainOfResponsibility;

/**
 * 后边的部门子类都要继承这个类，然后覆盖handleRequest方法去处理用户请求。
 *
 */
public abstract class Department {

	/**
	 * successor是指如果这个部门不能处理的话，将请求转接给的下一个部门。 
	 * 
	 */
	protected Department successor;
	
	/**
	 * 处理方法，调用此方法处理请求。
	 */
	public abstract void handleRequest(Request request);
	
	/** 
     * 赋值方法，调用此方法设置下家 
     *  
     * @param successor 
     */  
    public void setSuccessor(Department successor) {  
        this.successor = successor;
    }  
  
    /** 
     * 取值方法，得到下家对象 
     *  
     * @return 
     */  
    public Department getSuccessor() {  
        return successor;  
    }  

}
