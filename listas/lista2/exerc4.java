import java.util.*;


public class exerc4 {
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
		int x = 0;
		for (int i = 0; i < valores.length; i++) {
			x = (valores[i] > maior) ? (maior = valores[i]) : (valores[i] = maior);
			//		if(valores[i] > maior) {
			//			maior = valores[i];
			//		}
		}
		for (int j = 0; j < valores.length; j++) {
			x = (valores[j] <  menor || menor == 0) ? (menor = valores[j]) : (valores[j] = menor);
		}
		System.out.println("maior valor: " + maior);
		System.out.println("menor valor: " + menor);
		System.out.println("saída do x: " + x);
	}
}
