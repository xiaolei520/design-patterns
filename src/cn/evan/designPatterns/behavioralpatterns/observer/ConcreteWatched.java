package cn.evan.designPatterns.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色(Watched)
 *
 */
public class ConcreteWatched implements AbstractWatched {
	
	// 存放观察者的一个集合对象
	List<AbstractWatcher> watchers = new ArrayList<AbstractWatcher>();

	@Override
	public void addAbstractWatcher(AbstractWatcher watcher) {
		watchers.add(watcher);
	}

	@Override
	public void removeAbstractWatcher(AbstractWatcher watcher) {
		
		watchers.remove(watcher);
	}

	@Override
	public void removeAll() {
		
		watchers.clear();
	}

	@Override
	public void notifyWatchers() {
		
		for(AbstractWatcher watcher:watchers){
			watcher.update();
		}
	}

}
