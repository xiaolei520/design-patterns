package cn.evan.designPatterns.behavioralpatterns.observer;

/**
 * 抽象主题角色类。
 *
 */
public interface AbstractWatched {

	/**
	 * 增加一个观察者。
	 */
	public void addAbstractWatcher(AbstractWatcher watcher);
	
	/**
	 * 移除一个观察者。
	 */
	public void removeAbstractWatcher(AbstractWatcher watcher);
	
	/**
	 * 移除所有的观察着。
	 */
	public void removeAll();
	
	/**
	 * 通知所有观察者。
	 */
	public void notifyWatchers();
}
