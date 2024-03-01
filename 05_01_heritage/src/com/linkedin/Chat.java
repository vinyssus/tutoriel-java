package com.linkedin;

public class Chat extends Animal {
	
	private String couleur;

	public Chat(String prenom, int taille, int poids, int age, String couleur) {
		super(prenom, taille, poids, age);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
