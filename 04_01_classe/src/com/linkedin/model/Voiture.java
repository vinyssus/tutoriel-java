package com.linkedin.model;


public class Voiture {
	
	// Etat
	String marque;
	String couleur;
	int nombrePlaces;

	// Comportement
	void demarrer() {
		System.out.println("D�marrage de la voiture");
	}

	void arreter() {
		System.out.println("Arr�t de la voiture");
	}

	void accelerer() {
		System.out.println("Acc�l�ration de la voiture");
	}

}
