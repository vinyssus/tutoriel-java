package com.linkedin;

public class Cercle extends FormeGeometrique {

	private long rayon;
	private static final double PI = 3.14;

	public Cercle(long rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return PI * rayon * rayon;
	}

}
