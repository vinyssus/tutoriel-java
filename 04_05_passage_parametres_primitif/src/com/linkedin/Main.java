package com.linkedin;

public class Main {

	public static void main(String[] args) {
		int age = 20;
		System.out.println("Age = " + age);
		modifierAge(age);
		System.out.println("Age = " + age);

	}

	private static void modifierAge(int age) {
		age = age + 5;
		System.out.println("Age = " + age);
	}

}
