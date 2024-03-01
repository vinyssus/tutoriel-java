package com.linkedin;

public class Rectangle extends FormeGeometrique {

	private long longueur;
	private long largeur;

	public Rectangle(long longueur, long largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur * largeur;

	}

}
