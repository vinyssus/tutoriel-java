package com.linkedin;

public class  Animal {
	
	private String nom;
	private int taille;
	private int poids;
	private int age;
	
	
	public Animal(String nom, int taille, int poids, int age) {
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.age = age;
	}
	
	public void seDeplacer() {
		System.out.println("L'animal se déplace");
	}
	
	
	public void manger() {
		System.out.println("L'animal mange");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
}
