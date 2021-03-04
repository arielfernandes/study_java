import java.util.*;

public class exerc8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		for(int i = 0; i < 9; i++) {
			System.out.printf("\nInforme um número de 1 a 9: ");
			n = read.nextInt();
			String result = (n < 0 || n > 9) ? "O valor está fora da faixa." : "O valor está na faixa permitida";
			System.out.printf("\n%s\n", result);
		}
	}
}
