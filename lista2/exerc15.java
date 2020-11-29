import java.util.*;

public class exerc15 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe uma valor inteiro: ");
		int x = read.nextInt();

		System.out.println("Informe uma valor inteiro: ");
		int y = read.nextInt();

		if(x % y == 1) {
			int soma = x + y;
			System.out.printf("A soma de %d + %d = %d", x, y, soma);
		}else if(x % y == 2) {
			if(x % 2 == 0) {
				System.out.printf("Par -> %d", x);
			}else if(y % 2 == 0) {
				System.out.printf("Par -> %d", y);
			}else if(x % 2 == 1) {
				System.out.printf("Impar -> %d", x);
			}else if(y % 2 == 1) {
				System.out.printf("Impar -> %d", y);
			}
		}else if(x % y == 3) {
			int soma = x + y;
			int mult = x * soma;
			System.out.printf("Multiplicação de %d por %d, multiplicado por %x = %d", x, y, x, mult);
		}else if(x % y == 4) {
			int soma = x + y;
			int divis =  soma / y;
			System.out.printf("Divisaão da soma,  %d por %d, dividido por %y = %d", x, y, x, divis);
		}else {
			System.out.println("Valores fora dos requisitos.");
		}

	}
}
