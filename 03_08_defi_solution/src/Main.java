import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// n! = 1 * 2 * ...* n
		// Exemple : 4! = 1 * 2 * 3 * 4

		System.out.println("Veuillez entrer un nombre entier sup�rieur � 0 : ");
		Scanner scanner = new Scanner(System.in);

		try {
			int n = scanner.nextInt();
			if (n > 0) {
				int facto = 1;
				for (int i = 1; i <= n; i++) {
					facto = facto * i; // 1 * 2 * ... * n
				}
				System.out.println("Factoriel de " + n + " est: " + facto);
			} else {
				System.out.println("Le texte saisi n'est pas un nombre entier positif.");
			}
		} catch (Exception e) {
			System.out.println("Le texte saisi n'est pas un nombre entier positif.");
		} 
		finally {
			scanner.close();
		}
	}

}
