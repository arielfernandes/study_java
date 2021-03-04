import java.util.*;

public class arrays {
	public static int somar(int[] a) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			soma += a[i];
		}
		System.out.println("Soma do array: " + soma);
		return 0;
	}
	public static int print(int[] a) {
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("\n%3d -> [%d] ",a[i], i);
		}
		System.out.println("");
		return 0;
	}
	public static int MaiorMenor(int[] a) {
		int maior, menor, posMaior, posMenor;
		maior = menor = posMaior = posMenor = 0;
		for (int i = 0; i < a.length; i++) {
			if(maior == 0 &&  menor == 0) {
				maior = a[i];
				menor = a[i];
			}else if(maior <= a[i]) {
				maior = a[i];
				posMaior = i;
			}else if(menor >= a[i]) {
				menor = a[i];
				posMenor = i;
			}
		}
		System.out.println("Maior: " + maior + " Posição: " + posMaior);
		System.out.println("Menor: " + menor + " Posição: " + posMenor);
		return 0;
	}

	public static int pares(int[] a) {
		int[] pares;
		System.out.println("Valores pares: ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.printf("\n%3d -> [%d] ",a[i], i);
			}
		}
		System.out.println("");
		return 0;
	}
	public static void main(String[] args) {
		int[] array = {11, 989, 6, 8, 9, 2, 3, 22, 76, 98};

		print(array);
		MaiorMenor(array);
		somar(array);
		pares(array);

	}

}
