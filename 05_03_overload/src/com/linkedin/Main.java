package com.linkedin;

public class Main {

	public static void main(String[] args) {
		
		Chat chat = new Chat("Caramel", 25, 10, 2, "noir");
		chat.manger();
		chat.manger(2);
		
		Animal animal = new Chat("Minou", 15, 8, 1, "Blanc");
		animal.manger();
		
	}
}
