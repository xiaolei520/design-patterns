package com.goda.designpatterns.behavioralpatterns.chainOfResponsibility;

public class Request {

	public enum RequestType {  
        /** 产品错误 */
        ProductError,
        /** 功能使用 */
        FunctionUsage,
        /** 其他请求 */
        Others
    }  
  
    private RequestType type;  
  
    public Request(RequestType type) {  
        this.type = type;
    }  
  
    public RequestType getType() {
        return type;
    }  

}
