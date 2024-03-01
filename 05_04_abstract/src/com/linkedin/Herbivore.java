package com.linkedin;

public class Herbivore extends Animal {

	public Herbivore(String prenom, int taille, int poids, int age) {
		super(prenom, taille, poids, age);
	}
	
	@Override
	public void manger() {
		System.out.println("Manger de l'herbe");
	}

}
