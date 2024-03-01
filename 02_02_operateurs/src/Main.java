
public class Main {

	public static void main(String[] args) {

		// Affectation
		int i = 5;
		i = i + 3;

		// Arithmétiques (+, -, *, /, %)
		int a = 5 + 2;
		int b = 10 - 7;
		int c = 4 * 5;
		int d = 9 / 3;

		int e = 1 + 2 - 3;
		int f = 1 + 2 * 3;
		int g = (1 + 2) * 3;
		System.out.println(g);

		int m = 5 % 2;
		System.out.println(m);

		// Opérateurs relationnels (>, >=, <, <=, ==, !=)
		int x = 45;
		int y = 49;
		boolean bool = (x > y);
		System.out.println(b);
		bool = (x == y);
		bool = (x != y);

		// Opérateurs logiques (&&, ||, !, ^,  &, |)
		boolean var1 = true;
		var var2 = false;
		// Et
		boolean resultat = (var1 && var2);
		
		// Ou
		System.out.println(var1 || var2);
		
		// XOR : Ou exclusif
		System.out.println(false ^ true);
		// !
		System.out.println(!false);

		// Incrémentation/décrémentation
		int val = 10;
		int res1 = val++;
		System.out.println(res1);
		int res2 = ++val;
		System.out.println(res2);
		

		// Opérateur ternaire : condition ? instruction1 : instruction2
		int v1 = 10;
		int v2 = 15;
		int variable = (v1 > v2) ? 5 : 4;

	}

}
