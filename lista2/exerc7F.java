import java.util.*;

public class exerc7F {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int x;
		for(int i = 0; i < 4; i++) {
			System.out.println("\nInforme um númeor inteiro: ");
			x = read.nextInt();

			if(x % 2 == 0 && x % 3 == 0)  System.out.printf("\nO Número %d é divisível por 2 e 3\n", x);
			if (x % 2 == 0 || x % 3 == 0){ 
				if(x % 2 == 0) { System.out.printf("\nO número %d é divisível por 2\n", x); }
				else if(x % 3 == 0) { System.out.printf("\nO número %d é divisível por 3\n" ,x); }
			} else System.out.printf("\nO número %d não é divisivel por 2 e nem 3\n", x);
		}
	}
}

