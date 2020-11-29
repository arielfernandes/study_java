import java.util.*;

public class exerc2  {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int menor = 0;
		int	maior = 0;
		System.out.println("Informe o primeiro número: ");
		int x = read.nextInt();

		System.out.println("Informe o segundo número: ");
		int y = read.nextInt();
			if(x < maior || maior == 0 && y < maior){
				x = maior;
				y = maior;
			}else if( y < x) {
				maior = x;
				menor = y;
			}else if(x < y) {
				maior = y;
				menor = x;
			}else {
				System.out.printf("\nOs valores %d são %d iguais", x, y);
			}

		System.out.printf("\nMenor: %d\n", menor);
		System.out.printf("Maior: %d\n", maior);
	}
}
