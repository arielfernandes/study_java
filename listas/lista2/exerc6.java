import java.util.*;

public class exerc6 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

		System.out.printf("Informe o 1º valor: ");
		int a = read.nextInt();
		
		System.out.printf("\nInforme o 2º valor: ");
		int b = read.nextInt();
		
		System.out.printf("\nInforme o 3º valor: ");
		int c = read.nextInt();

		//verificando se os valores forma um triangulo
		if( a < b && b < a && c < a + b){
			if (a == b && a == c && b == c) {
				System.out.println("Escaleno.");
			} else if (a != b && b != c){
				System.out.println("Equilátero.");
			} else {
				System.out.println("Isósceles.");
			}
		}else System.out.println("Não é um triângulo válido.");
	}
}
