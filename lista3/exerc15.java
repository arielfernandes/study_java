import java.util.*;

public class exerc15 {
	public static int verificar(int x, int y) {
		if( x < y ){
			System.out.printf("\nO valor %d é maior que %d.\n", y, x);
		}else if (x > y ) {
			System.out.printf("\nO valor %d é maior que %d.\n", x, y);

		}else{
			System.out.printf("\nO valor %d é igual %d.\n", y, x);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int aux = 0;
		while ( true) {
				System.out.println("Informe um numero: ");
				int x = read.nextInt();
				System.out.println("Informe um numero: ");
				int y = read.nextInt();

				aux = x;
				aux = y;
				if(aux == 0) { break; }
				
				verificar(aux, x);
		}
	}
}

