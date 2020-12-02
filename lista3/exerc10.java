import java.util.*;

public class exerc10 {
	static int CalcCombustivel(int km, int qtdComb, float dist) {
		int tanqCheio = 0;

		tanqCheio = km * qtdComb;
		System.out.println("consumo em quilômetros/litro para cada tanque: " + tanqCheio);
		float total = tanqCheio / dist;
		System.out.printf("\nO total gasto de Combustível: %.2f\n",total);

		return 0;
	}
	static int registro(){
		Scanner read = new Scanner(System.in);
		System.out.println("Informe quantos km faz com litro: ");
		int km = read.nextInt();
		System.out.println("Informe quantidade de combustível: ");
		int qtdComb = read.nextInt();
		System.out.println("Informe a distacia percorrida: ");
		int dist = read.nextInt();
		CalcCombustivel(km, qtdComb, dist);
		continuar();
		return 0;
	}
	static int continuar(){
		Scanner read = new Scanner(System.in);
		System.out.println("Deseja continuar? 1 - sim / 2 - não");
		int resp = read.nextInt();

		if (resp == 1){
			registro();
		}else if (resp == 2) {
			System.exit(0);
		} else {
			System.out.println("Resposta inválida!!");
			continuar();
		}
		return 0;
	}

	public static void main(String[] args){

		while(true) {
			registro();
		}
	}
}

