
public class Main {

	public static void main(String[] args) {

		try {
			int[] tab = { 1, 2, 3 };
			int x = tab[3];
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Dans le bloc catch");
		} finally {
			System.out.println("On passe ici quoi qu'il arrive");
		}
		
		System.out.println("Le programme continue son exécution...");

	}

}