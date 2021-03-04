import java.util.*;

public class exerc16 {

	static int Adicao(int x, int y) {
		int adicao = x + y;
		System.out.printf("\nAdição de %d + %d = %d.\n", x, y, adicao);
		return 0;
	}
	static int Subtracao(int x, int y) {
		int subtracao = x - y;
		System.out.printf("\nSubtração de %d - %d = %d.\n", x, y, subtracao);
		return 0;
	
	}
	static int Multiplicao(int x, int y) {
		int multiplicao = x * y;
		System.out.printf("\nMultiplicação de %d X %d = %d.\n", x, y, multiplicao);
		return 0;
	
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Iforme um valor inteiro: ");
		int x = read.nextInt();

		System.out.println("Iforme um valor inteiro: ");
		int y = read.nextInt();
		
		System.out.printf("\n1 - Adição\n2 - Subtração\n3 - Multiplição\n");
		int r = read.nextInt();
		
		switch(r) {
			case 1:
				Adicao(x, y);
				break;
			case 2:
				Subtracao(x, y);
				break;
			case 3:
				Multiplicao(x, y);
				break;

			default:
				System.out.println("Opção inválida!");
		}
	
	}
}
