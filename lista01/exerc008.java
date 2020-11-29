import java.util.*;

public class exerc008 {
	static int calcMedia(int x, int y, int z) {
		int maior = 0;
		int menor = 0;
		int notas[] = {x, y, z};
		int media;

		//informar notas (foreach)
		System.out.printf("\nAs notas inseridas: ");
		for( int i : notas) {
			System.out.print(i + " ");
		}
		//calculo da media
		media = (x + y + z) / 3;
		System.out.println("\n\nA média do aluno: " + media);

		// verificar maior e menor nota
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > maior) {
				maior = notas[i];
			}
		}

		for (int i = 0; i < notas.length; i++) {
			if(notas[i] < menor || menor == 0) {
				menor = notas[i];
			}
		}

		//saida
		System.out.println("\nA maior nota foi: " + maior);
		System.out.println("A menor nota foi: " + menor);
		return 0;
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String x, y, z;

		System.out.printf("Informe o 1º número .....: ");
		x = read.next();
		System.out.printf("Informe o 3º número .....: ");
		y = read.next();
		System.out.printf("Informe o 2º número .....: ");
		z = read.next();
	
		int Nx = Integer.parseInt(x);
		int Ny = Integer.parseInt(y);
		int Nz = Integer.parseInt(z);

		calcMedia(Nx, Ny, Nz);
	}

}
