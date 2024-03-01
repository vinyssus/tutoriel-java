package com.linkedin;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal("ani", 30, 15, 3);
		animal.manger();
		animal.seDeplacer();
		
		//Chat hérite des méthodes génériques de Animal
		Chat chat = new Chat("minou", 25, 10, 2, "noir");
		chat.manger(); 
		chat.seDeplacer();
		
		// Une classe Java hérite indirectement de la classe Object
		animal.toString();
		chat.toString(); 
		
		// Tester le type d'un objet
		if(chat instanceof Object) {
			System.out.println("chat est un objet");
		}
		if(chat instanceof Animal) {
			System.out.println("chat est un animal");
		}
		if(chat instanceof Chat) {
			System.out.println("chat est un chat");
		}
		

	}

}
