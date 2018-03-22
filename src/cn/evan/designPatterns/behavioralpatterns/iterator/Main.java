package cn.evan.designPatterns.behavioralpatterns.iterator;

public class Main {

	public static void main(String[] args) {
		
		Aggregate agg = new ConcreteAggregate();
		agg.add("1小陈");
		agg.add("2小虹");
		agg.add("3小杨");
		agg.add("4小黄");
		
		Iterator iterator = agg.iterator();
		while(iterator.hasNext()){
			String obj = (String)iterator.next();
			System.out.println(obj);
		}
	}
}
