import java.util.*; 
public class exerc5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Para saber se impar ou par\nInforme um número: ");
		int x = read.nextInt();

		String valor = (x % 2 == 0) ? "Par" : "Impar";
		System.out.printf("O número %d é um valor " + valor + ".\n",x);
	}
}
