package com.linkedin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, Animal> maMap = new HashMap<>();
		maMap.put("chat1", new Animal("cookie", 2));
		maMap.put("chat2", new Animal("Mini", 2));
		
		
		Animal animal = maMap.get("chat1");

		Set<String> cles = maMap.keySet();

//		for (String cle : cles) {
//			var item = maMap.get(cle);
//			System.out.println(item);
//		}

//		System.out.println(maMap.entrySet());
	System.out.println(maMap.values());
	
	}

}

class Animal {
	private String nom;
	private int age;

	public Animal(String nom, int age) {
		super();
		this.age = age;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "nom : " + nom + ", age : " + age;
	}

}
