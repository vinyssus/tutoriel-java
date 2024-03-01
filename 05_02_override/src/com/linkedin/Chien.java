package com.linkedin;

public class Chien extends Animal {

	public Chien(String prenom, int taille, int poids, int age) {
		super(prenom, taille, poids, age);
	}
	
	@Override
	public void manger() {
		System.out.println("Le chien mange spécifiquement");
	}


}
