package cn.evan.designPatterns.decorator;

public class DecoratorBlueTooth extends Decorator {

	public DecoratorBlueTooth(CellPhone cellPhone) {
		super(cellPhone);
	}
	
	@Override
	public String callNumber() {
		
		return super.callNumber() + " with BlueTooth";
	}
	
	@Override
	public String sendMessage() {
		
		return super.sendMessage() + " with BlueTooth";
	}

}
