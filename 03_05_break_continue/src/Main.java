
public class Main {

	public static void main(String[] args) {

		int[] tab = { 55, 26, 14, 67 };
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 26) {
				continue;
			}
			System.out.println(tab[i]);
		}
	}

}
