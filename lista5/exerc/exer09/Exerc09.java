/*
   Faça um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a união
   entre os 2 vetores anteriores, ou seja, que contém os números dos dois vetores. Não deve
   conter números repetidos.
   */
import java.util.*;

public class Exerc09 {
	public static void juntar(int[] a, int[] b ) {
		ArrayList<Integer> vetor3 = new ArrayList<>();
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[j] != b[j]) {
					vetor3.add(a[j]);
					vetor3.add(b[j]);
				}
			}
		}

		System.out.println("Novo array");
		for(int i = 0; i < vetor3.size(); i++) {
			System.out.print(vetor3.get(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] vetor2 = {11, 22, 3, 48, 5, 60, 71, 8, 92, 10};
		juntar(vetor1, vetor2);
	}

}
