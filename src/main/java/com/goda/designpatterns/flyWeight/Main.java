package com.goda.designpatterns.flyWeight;

public class Main {

	public static void main(String[] args) {
		
		CharactorFactory factory = new CharactorFactory();
		
		Charactor charactorA = factory.getCharactor("A");
		charactorA.setFontSize(20);
		charactorA.display();
		
		Charactor charactorB = factory.getCharactor("B");
		charactorB.setFontSize(20);
		charactorB.display();
	}
}
