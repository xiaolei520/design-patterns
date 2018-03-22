package cn.evan.designPatterns.flyWeight;

public class CharactorC extends Charactor {
	
	public CharactorC() {
		this.letter = 'C';
		this.fontSize = 18;
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
