package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal( "dog",2.3,"Szarik");
	dog.feed();
		dog.feed();
		dog.feed();


	Human me=new Human();
	me.firstName="Wojciech";
	me.lastName="Winiarz";
	me.pet = dog;

	System.out.println("Zwoerzak nazywa się" + me.pet.name);
    }
}
