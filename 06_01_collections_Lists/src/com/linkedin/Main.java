package com.linkedin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> maListe = new ArrayList<>();

		maListe.add("Lundi");
		maListe.add("Mardi");
		maListe.add("Mercredi");

		for (int i = 0; i < maListe.size(); i++) {
			System.out.println(maListe.get(i));
		}

		for (String element : maListe) {
			System.out.println(element);
		}

		System.out.println(maListe.isEmpty());

		maListe.remove(1);
		maListe.clear();

		List<String> maListe2 = new LinkedList<>();
		maListe2.add("C");
		maListe2.add("A");
		maListe2.add("B");

		for (String elem : maListe2) {
			System.out.println(elem);
		}

	}

}
