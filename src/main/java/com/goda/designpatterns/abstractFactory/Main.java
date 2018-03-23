package com.goda.designpatterns.abstractFactory;

public class Main {

	public static void main(String[] args) {
		
		IAnimalFactory animalFactory = new BlackAnimalFactory();
		Cat cat = animalFactory.createCat();
		Dog dog = animalFactory.createDog();
		
		cat.eat();
		dog.eat();
	}
}
