import java.util.*;

public class exerc13 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int min = 0, x = 0;

		System.out.println("Quantidade de valores a serem lidos: ");
		int entrada = read.nextInt();

		for (int i = 0; i < entrada; i++) {
			System.out.println("Informe um valor: ");
			x = read.nextInt();
			if(min > x || min == 0) {
				min = x;
			}
		}
		System.out.println("minimo = " + min);
	}
}

