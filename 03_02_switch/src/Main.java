
public class Main {

	public static void main(String[] args) {

		/*
		 * switch (expression)                  // expression : byte, short, int, enum, Sring depuis Java 7
		 *  {         
		 *    case constant1: Bloc_de_code1
		 *    case constant2: Bloc_de_code2
		 *    ...
		 *    default: Bloc_de_codeN
		 *  }
		 */

		int x = 2;

		switch (x) { 

		case 1 ->
			System.out.println("Option n° 1");
			
		case 2 ->
			System.out.println("Option n° 2");
		
		case 3 ->
			System.out.println("Option n° 3");
			
		default ->
			System.out.println("Cette option n'existe pas");
		}
		
	}

}
