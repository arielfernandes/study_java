import java.util.*;

public class arraysBidimensional {
	public static int somar(int[][] a) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				soma += a[i][j];
			}
		}
		System.out.println("Soma do array: " + soma);
		return 0;
	}
	public static int print(int[][] a) {
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("\n%3d | %d -> [%d]",a[i][j], i, j);
			}
		}
		System.out.println("");
		return 0;
	}

	public static int pares(int[][] a) {
		int[][] pares;
		System.out.println("Valores pares: ");
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j] % 2 == 0) {
					System.out.printf("\n%3d", a[i][j], i, j);
				}
			}	
		}
		System.out.println("");
		return 0;
	}
	public static int maiorMenor(int[][] a) {
		int[][] maior = null;
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(maior[i][j] == 0) {
					maior[i][j] = a[i][j];
				}else if(maior[i][j] <= a[i][j]){
					maior[i][j] = a[i][j];
				}
				System.out.println(maior[i][j]);
			}
		}

		System.out.println("");
		return 0;
	}
	public static void main(String[] args) {
		int[][] array = {{11, 989, 6, 8, 9, 2, 3, 22, 76, 98}, {1, 9, 4, 89, 7, 88, 73, 74, 12, 11}};

		print(array);
		maiorMenor(array);
		somar(array);
		pares(array);

	}

}

