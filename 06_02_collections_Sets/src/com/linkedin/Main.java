package com.linkedin;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// HashSet
		Set<Animal> maSet = new HashSet<>();
		Animal a1 = new Animal("toto", 1);
		System.out.println(maSet.add(a1));
		System.out.println(maSet.add(a1));
		System.out.println(maSet.add(new Animal("tata", 2)));
		

		// TreeSet
		Set<String> maTreeSet = new TreeSet<>();
		System.out.println(maTreeSet.add("B"));
		System.out.println(maTreeSet.add("C"));
		System.out.println(maTreeSet.add("A"));

		for (String ch : maTreeSet) {
			System.out.println(ch);
		}

		// TreeSet avec d'autres objets
		Set<Animal> aTreeSet = new TreeSet<>();
		aTreeSet.add(new Animal("Rex", 10));
		aTreeSet.add(new Animal("Mini", 5));

		for (Animal animal : aTreeSet) {
			System.out.println(animal);
		}

	}

}

class Animal implements Comparable<Animal> {
	private String nom;
	private int age;

	public Animal(String nom, int age) {
		super();
		this.age = age;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "nom : " + nom + ", age : " + age;
	}

	@Override
	public int compareTo(Animal animal) {
		if (this.age == animal.getAge())
			return 0;
		else if (this.age < animal.age)
			return -1;
		else
			return 1;
	}

}
