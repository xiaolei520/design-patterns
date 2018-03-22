package cn.evan.java;

public class ClassInitializationSequence1 {   
	  
    // ��̬����   
    public static String staticField = "��̬����";   
    // ����   
    public String field = "����";   
  
    // ��̬��ʼ����   
    static {   
        System.out.println(staticField);   
        System.out.println("��̬��ʼ����");
    }
    
    public static TestA staticField2 = new TestA();
  
    // ��ʼ����   
    {   
        System.out.println(field);   
        System.out.println("��ʼ����");   
    }   
  
    // ������   
    public ClassInitializationSequence1() {   
        System.out.println("������");   
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