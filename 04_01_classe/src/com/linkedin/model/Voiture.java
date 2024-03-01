package com.linkedin.model;


public class Voiture {
	
	// Etat
	String marque;
	String couleur;
	int nombrePlaces;

	// Comportement
	void demarrer() {
		System.out.println("Démarrage de la voiture");
	}

	void arreter() {
		System.out.println("Arrêt de la voiture");
	}

	void accelerer() {
		System.out.println("Accélération de la voiture");
	}

}
