package cn.evan.designPatterns.behavioralpatterns.interpreter;

/**
 * 总裁
 *
 */
public class President implements Command {
	
	private Boss boss;
	private String order;
	
	public Boss callBoss(){
		
		boss = new Boss();
		return boss;
	}

	@Override
	public void execute(String order) {
		
		this.order = order;
		boss.execute(order);
	}

}
