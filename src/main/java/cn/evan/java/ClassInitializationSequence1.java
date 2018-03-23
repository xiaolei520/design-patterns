package cn.evan.java;

public class ClassInitializationSequence1 {   
	  
    // 静态变量   
    public static String staticField = "静态变量";   
    // 变量   
    public String field = "变量";   
  
    // 静态初始化块   
    static {   
        System.out.println(staticField);   
        System.out.println("静态初始化块");
    }
    
    public static TestA staticField2 = new TestA();
  
    // 初始化块   
    {   
        System.out.println(field);   
        System.out.println("初始化块");   
    }   
  
    // 构造器   
    public ClassInitializationSequence1() {   
        System.out.println("构造器");   
    }   
  
    public static void main(String[] args) {   
        new ClassInitializationSequence1();
    }   
}  

class TestA {   
    public TestA() {   
        System.out.println("Test--A");   
    }   
}   
  
class TestB {   
    public TestB() {   
        System.out.println("Test--B");   
    }   
}  