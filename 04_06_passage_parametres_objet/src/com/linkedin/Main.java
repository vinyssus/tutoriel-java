package com.linkedin;

public class Main {

	public static void main(String[] args) {
		String prenom = "Alice";
		System.out.println("Prénom = "+ prenom);
		modifierPrenom(prenom);
		System.out.println("Prénom = "+ prenom);
		

	}
	
	private static void modifierPrenom(String prenom) {
		prenom = prenom + " est un prénom";
		System.out.println(prenom);
	}

}
