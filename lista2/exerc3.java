import java.util.*;


public class exerc3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//criando um array
		int menor = 0;
		int maior = 0;
		int[] valores = new int[5];

		for(int i = 0; i < 5; i++){
			System.out.println("Informe um valor: ");
			valores[i] = read.nextInt();
			read.nextLine();
		}

		for (int i = 0; i < valores.length; i++) {
			if(valores[i] > maior) {
				maior = valores[i];
			}
			for (int j = 0; j < valores.length; j++) {
				if(valores[j] > menor && menor == 0)
					menor = valores[j];
			}
		}
			System.out.println("maior valor: " + maior);
			System.out.println("menor valor: " + menor);
	}
}
