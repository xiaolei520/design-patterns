package cn.evan.designPatterns.flyWeight;

public class CharactorB extends Charactor {
	
	public CharactorB() {
		this.letter = 'B';
		this.fontSize = 15;
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
