package com.linkedin;

public class Main {

	public static void main(String[] args) {
		
		Chat chat = new Chat("Caramel", 25, 10, 2, "Noir");
		chat.manger();
		chat.seDeplacer();
		
		Animal animal = new Chat("Minou", 15, 8, 1, "Blanc");
		animal.manger();
		
		animal = new Chien("Rex", 15, 8, 1);
		animal.manger();
		
		animal = new Animal("Ani", 20, 12, 2);

	}

}
