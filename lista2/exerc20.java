import java.util.*;

public class exerc20 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a nota: ");
		int nota = read.nextInt();

		if(nota < 3) {
			System.out.printf("\nNota %d conceito E.\n", nota);
		}else if(nota <= 5) {
			System.out.printf("\nNota %d, conceito D.\n", nota);
		}else if(nota <= 7) {
			System.out.printf("\nNota %d, conceito C.\n", nota);
		}else if(nota <= 9) {
			System.out.printf("\nNota %d, conceito B.\n", nota);
		}else if(nota == 10) {
			System.out.printf("\nNota %d, conceito A.\n", nota);
		}else { System.out.printf("\nNota fora do padrão.\n"); }
	}

}
