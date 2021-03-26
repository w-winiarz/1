package com.company;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("dog");
		dog.feed();
		dog.feed();
		dog.feed();


		Human me = new Human();
		me.firstName = "Wojciech";
		me.lastName = "Winiarz";
		me.pet = dog;
		dog.takeForAWalk();
		dog.takeForAWalk();
		System.out.println("Zwierzak nazywa się" + me.pet.name);

		me.car = new Car("Punto","Fiat");


	}
}
