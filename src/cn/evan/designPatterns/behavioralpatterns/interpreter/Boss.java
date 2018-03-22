package cn.evan.designPatterns.behavioralpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 *
 */
public class Boss implements Command {
	
	private static List<Manager> managers = new ArrayList<Manager>();
	private Manager devManager = null;
	private String order;
	
	static{
		for(int i=0;i<10;i++){
			managers.add(new Manager());
		}
	}
	
	public void serviceForPresident(){
		
		devManager.execute(order);
	}

	@Override
	public void execute(String order) {
		
		//..经过分析讨论，让开发四部去开发这套系统
		this.order = order;
		devManager = managers.get(3);
		serviceForPresident();
		
	}

}
