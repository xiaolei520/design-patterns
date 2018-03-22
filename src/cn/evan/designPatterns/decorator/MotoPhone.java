package cn.evan.designPatterns.decorator;

public class MotoPhone implements CellPhone {

	@Override
	public String callNumber() {
		
		return "MotoPhone call sombody";
	}

	@Override
	public String sendMessage() {
		
		return "MotoPhone send a message to somebody";
	}

}
