
public class Main {

	public static void main(String[] args) {
		
		// D�claration
		int[] monTab;
		
		// Construction et assignation
		monTab = new int[3];
		
		// Initialisation
		monTab[0] = 5;
		monTab[1] = 8;
		monTab[2] = 9;
		
		// Acc�der � sa taille
		System.out.println(monTab.length);
		
		// Parcourir un tableau
		for (int i=0; i <= monTab.length - 1; i++) {
			System.out.println(monTab[i]);
		}
		
		
		// D�clarer, construire et remplir un tableau avec une seule instruction
		int [] tab2 = {5, 8, 10, 25};
		
		// Cr�er des tableaux d'objets
		String [] tab3 = new String [10];
		tab3[5] = new String("une chaine");
		
		String chaine = tab3[15];  // ArrayIndexOutOfBoundsException

	}

}
