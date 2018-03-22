package cn.evan.designPatterns.flyWeight;

public class CharactorA extends Charactor {
	
	public CharactorA() {
		this.letter = 'A';
		this.fontSize = 12;
	}

	@Override
	public void display() {
		
		System.out.println(this.letter);
	}

	@Override
	public void setFontSize(int fontSize) {
		
		this.fontSize = fontSize;
	}

}
