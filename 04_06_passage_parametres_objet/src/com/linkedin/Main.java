package com.linkedin;

public class Main {

	public static void main(String[] args) {
		String prenom = "Alice";
		System.out.println("Pr�nom = "+ prenom);
		modifierPrenom(prenom);
		System.out.println("Pr�nom = "+ prenom);
		

	}
	
	private static void modifierPrenom(String prenom) {
		prenom = prenom + " est un pr�nom";
		System.out.println(prenom);
	}

}
