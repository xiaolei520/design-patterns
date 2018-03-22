package cn.evan.designPatterns.decorator;

public abstract class Decorator implements CellPhone {
	
	private CellPhone cellPhone;
	
	public Decorator(CellPhone cellPhone){
		this.cellPhone = cellPhone;
	}

	@Override
	public String callNumber() {
		
		return cellPhone.callNumber();
	}

	@Override
	public String sendMessage() {
		
		return cellPhone.sendMessage();
	}

}
