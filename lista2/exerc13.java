import java.util.*;

public class exerc13 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float[] notas = new float[5];
		float media = 0;

		for(int i = 0; i < 5; i++) {
			System.out.printf("\nInforme a %dº nota: ", i+1);
			notas[i] = read.nextFloat();
			media += notas[i];
		}
		media = media / notas.length;
		System.out.printf("\n---------------------------\n");
		System.out.printf("O valor da média: %.2f", media);
		for(int x = 0; x < notas.length; x++) {
			if(media < notas[x]) System.out.printf("\nO valor %.2f é maior que a média (%.2f).", notas[x], media);
		}
		System.out.printf("\n---------------------------\n");
	}
}
