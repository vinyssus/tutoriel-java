
public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Parcourir un tableau
		int total = 0;
		int[] tab = { 55, 26, 14, 67 };
		for (int i = 0; i <= tab.length -1; i++) {
			System.out.println(tab[i]);
			total = total + tab[i];
		}
		System.out.println("Total = " + total);
		
		total = 0;
		// Variante : for-each
		for (int element : tab) {
			System.out.println(element);
			total = total + element;
		}
		System.out.println("Total = " + total);

	}

}
