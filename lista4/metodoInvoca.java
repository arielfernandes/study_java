import java.util.*;

public class metodoInvoca {
	public static float somar(float a, float b) {
		float soma = (a + b);
		return soma;
	}
	public static float calcularMediaPonderada(double[] a, float[] b){
		float numeroPeso = 0, pesoTotal = 0, numerosTotal = 0, media = 0;

		for(int i = 0; i < 1; i++){
			numerosTotal = pesoTotal =  numeroPeso = 0;

			for(int j = 0; j < b.length; j++){
				numeroPeso = b[j];
				pesoTotal += numeroPeso;
				a[j] *= numeroPeso;
				numerosTotal += a[j];
			}

			media = numerosTotal / pesoTotal;
		}
		return media;
	}
	public static float mediaAritimetica(float a) {
		return a/3;
	}
	public static float mediaHarmonica() {
		System.out.println("entrou");
		return 0;
	}
	public static void resposta(float media) {
		String resp = (media >= 6) ? "Aprovado" : "Reprovado";
		System.out.printf("\n\nMédia: %.2f\nAluno: %s.\n\n", media, resp);
	}
	public static void opcoes(String op){
		switch (op) {
			case "a":
				float soma = somar(somar(8, 9), 9);
				resposta(mediaAritimetica(soma));
				break;
			case "p":
				double[] notas = {1, 2, 1, 7.5};
				float[] peso = {1, 2, 3, 4};
				float resultado = calcularMediaPonderada(notas, peso);
				resposta(resultado);
				break;
			case "h":
				mediaHarmonica();
				break;
			case "s":
				System.out.println("Saiu!!");
				System.exit(0);
				break;
			default:
				System.out.println("Opçao inválida!!");
				break;
		}
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("|         🅒🅐🅛🅒🅤🅛🅐🅡 🅜🅔🅓🅘🅐          |");
		System.out.println("-----------------------------------");
		System.out.println("------ Informe uma das opções -----");
		System.out.println("|  A) Calcular média aritmética.  |");
		System.out.println("|  P) Calcular média ponderada.   |");
		System.out.println("|  H) Calcular média harmônica.   |");
		System.out.println("|  S) sair.                       |");
		System.out.println("-----------------------------------\n");
		System.out.printf("\nOpção: ");
		String opcao = sc.next();

		opcoes(opcao.toLowerCase());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			menu();
		}


	}
}
