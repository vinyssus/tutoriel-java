package com.linkedin.execution;

import com.linkedin.model.Voiture;

public class Main {
	
	int  entier = 3;

	public static void main(String[] args) {

		new Voiture("AAA", "Rouge", 5);
		System.out.println(Voiture.compteur);
		
		new Voiture("BBB", "Bleu", 2);
		System.out.println(Voiture.compteur);
		
		new Voiture("CCC", "Jaune", 7);
		System.out.println(Voiture.compteur);
		
		new Voiture("DDD", "Noir", 5);
		System.out.println(Voiture.getCompteur());

		// On ne peut pas acc�der � un membre d'instance a partir d'une m�thode statique
		Main m = new Main();
		System.out.println(m.entier);
		

	}

}
