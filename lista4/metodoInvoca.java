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
	public static float calcularMediaAritimetica(float[] a) {
		float x = 0;
		for (int i = 0; i < a.length; i++) {
			x += a[i];
		}
		return x / a.length;
	}
	public static float calcularMediaHarmonica(double[] notas) {
		float aux = 0;
		for(int i = 0; i < notas.length; i++) {
			aux += 1/notas[i];
		}
		return notas.length / aux;
	}
	public static void resposta(float media) {
		String resp = (media >= 6) ? "Aprovado" : "Reprovado";
		System.out.printf("\n\nMédia: %.2f\nAluno: %s.\n\n", media, resp);
	}
	public static float getAritimetica() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o total de notas: ");
		int total = sc.nextInt();
		float[] notas = new float[total];
		for (int i = 0; i < total; i++) {
			System.out.println("Informe a " + (1+i) + "° nota: ");
			notas[i] = sc.nextFloat();
		}
		float media = calcularMediaAritimetica(notas);
		return media;
	}
	public static float getPonderada() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o total de notas: ");
		int total = sc.nextInt();
		double[] notas = new double[total];
		float[] peso = new float[total];
		for (int i = 0; i < total; i++) {
			System.out.println("Informe a " + (1+i) + "° nota: ");
			notas[i] = sc.nextDouble();
			System.out.println("Informe o peso da nota: ");
			peso[i] = sc.nextFloat();
		}
		float media = calcularMediaPonderada(notas, peso);
		return media;
	}
	public static float getHarmonica() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o total de notas: ");
		int total = sc.nextInt();
		double[] notas = new double[total];
		for (int i = 0; i < total; i++) {
			System.out.println("Informe a " + (i+1) + "° nota: ");
			notas[i] = sc.nextDouble();
		}
		float media = calcularMediaHarmonica(notas);
		return media;
	}
	public static void opcoes(String op){
		Scanner sc = new Scanner(System.in);
		float resp = 0, retorno = 0;
		int total = 0;
		switch (op) {
			case "a":
				retorno = getAritimetica();
				resposta(retorno);
				break;
			case "p":
				retorno = getPonderada();
				resposta(retorno);
				break;
			case "h":
				retorno = getHarmonica();
				resposta(retorno);
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
