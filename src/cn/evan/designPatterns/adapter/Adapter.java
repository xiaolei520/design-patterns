package cn.evan.designPatterns.adapter;

public class Adapter implements ITarget{
	
	private Power power;
	
	public Adapter(Power power){
		this.power = power;
	}


	@Override
	public void getPower() {
		
		// 先获取220V电压
		power.getPower220V();
		
		// 然后利用变电设备得到想要的电压
		// ...
	}

}
