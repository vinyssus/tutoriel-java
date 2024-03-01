package com.linkedin;

public class B implements A, C {

	@Override
	public void methode1() {
		System.out.println("Dans methode1");
		
	}

	@Override
	public int methode2() {
		System.out.println("Dans methode2");
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
