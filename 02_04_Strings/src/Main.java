
public class Main {

	public static void main(String[] args) {
		
		// Créer des strings
		String str1 = new String("Le langage Java");
		String str = "Java est OO";
		
		// Taille
		System.out.println(str1.length());
		
		// String est immuable
		str1.toUpperCase();
		System.out.println(str1);
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		
		// Concaténer des String de deux manières
		String str3 = "Bonjour";
		str1 = str1.concat(str3);
		// En utilisant l'opérateur +
		String str4 = str3 + " Java " + 15;
		System.out.println(str4);
		
		// Autres méthodes de la classe String
		"abcdefg".charAt(2);
		"abc".equals("ABC");
		"abc".equalsIgnoreCase("ABC");
		str1.replace('a', 'b'); 
		str1.substring(2,5); 
		str1.toLowerCase();
		
	}

}
