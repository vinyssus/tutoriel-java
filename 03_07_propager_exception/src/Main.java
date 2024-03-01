

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		method2();
	}

	static void method1() throws IOException {
		System.out.println("cette methode peut lever une exception");
		// if(condition)
		throw new IOException();
	}

	static void method2() {
		try {
			method1();
		} catch (IOException e) {
			System.out.println("l'exception a été attrapée");
		}
	}

}
