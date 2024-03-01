package com.linkedin;

public abstract class Animal {

	private String prenom;
	private int taille;
	private int poids;
	private int age;

	public Animal(String prenom, int taille, int poids, int age) {
		super();
		this.prenom = prenom;
		this.taille = taille;
		this.poids = poids;
		this.age = age;
	}

	public abstract void manger();

	public void seDeplacer() {
		System.out.println("L'animal se déplace");
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
