import java.util.*;

public class exerc21 {
	static float CalcSalario(float x, float y) {
		float aumento =(x * y) / 100;
		float novoSal = x + aumento;
		return novoSal;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = read.next();
		float novo = 0;
		
		System.out.println("Informe o salário atual: ");
		float salario = read.nextFloat();

		if(salario <= 400.00) {
			novo = CalcSalario(salario, 15);
			System.out.printf("\nNome: %s\nSálario atual:R$ %.2f\nNovo salário:R$ %.2f\n", nome, salario, novo);
		}else if(salario <= 700.0) {
			novo = CalcSalario(salario, 12);
			System.out.printf("\nNome: %s\nSálario atual:R$ %.2f\nNovo salário:R$ %.2f\n", nome, salario, novo);
		}else if(salario <= 1000.0) {
			novo = CalcSalario(salario, 10);
			System.out.printf("\nNome: %s\nSálario atual:R$ %.2f\nNovo salário:R$ %.2f\n", nome, salario, novo);
		}else if(salario <= 1800.0) {
			novo = CalcSalario(salario, 7);
			System.out.printf("\nNome: %s\nSálario atual:R$ %.2f\nNovo salário:R$ %.2f\n", nome, salario, novo);
		}else if(salario <= 2500.0) {
			novo = CalcSalario(salario, 4);
			System.out.printf("\nNome: %s\nSálario atual:R$ %.2f\nNovo salário:R$ %.2f\n", nome, salario, novo);
		}else { System.out.printf("\nSr(a). %s seu sálario é acima de R$2500,00, sem aumento.\n",nome); }
	}
}
