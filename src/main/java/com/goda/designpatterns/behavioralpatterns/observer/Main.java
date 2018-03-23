package com.goda.designpatterns.behavioralpatterns.observer;

public class Main {

	public static void main(String[] args) {
		
		// 定义一个被观察者对象
		AbstractWatched watched = new ConcreteWatched();
		
		// 定义三个观察者对象
		AbstractWatcher watcher1 = new ConcreteWatcher();
		AbstractWatcher watcher2 = new ConcreteWatcher();
		AbstractWatcher watcher3 = new ConcreteWatcher();
		
		// 被观察者添加观察者. 被观察者和观察者之间关系是一对多关系
		watched.addAbstractWatcher(watcher1);
		watched.addAbstractWatcher(watcher2);
		watched.addAbstractWatcher(watcher3);
		
		System.out.println("第1次...");
		// 被观察者发生改变时，通知观察者执行相应方法
		watched.notifyWatchers();
		
		// 移除一个观察者
		watched.removeAbstractWatcher(watcher1);
		System.out.println("第2次...");
		watched.notifyWatchers();
		
		// 移除所有观察者
		watched.removeAll();
		System.out.println("第3次...");
		watched.notifyWatchers();
	}
}
