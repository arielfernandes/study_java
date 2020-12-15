import java.util.*;

public class funcionario {
	public static void clearBuffer(Scanner sc) {
		if(sc.hasNextLine()) {
			sc.nextLine();
		}
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\033\143");
		System.out.println("1 - calcular");
		System.out.println("2 - Tela bloqueio");
		System.out.println("3 - sair");
		System.out.printf("\nOpção: ");
		int opcao = sc.nextInt();

		opcoes(opcao);
	}
	public static void opcoes(int op) {
		Scanner sc = new Scanner(System.in);

		switch (op) {
			case 1:
				getInformacoes();
				break;
			case 2:
				break;
			case 3:
				System.out.println("Volte Sempre!!!");
				System.exit(0);
				break;
		}
	}
	public static void getInformacoes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do funcionario: ");
		String nome = sc.next();
		System.out.println("Informe o mês e ano de referencia:  ");
		System.out.println("Ex:. Janeiro/2000 ");
		String mesAno = sc.next();
		System.out.println("Informe o sálario base: ");
		float salarioBase = sc.nextFloat();
		System.out.println("Informe o total de vendas: ");
		float totalVendas = sc.nextFloat();
		System.out.println("Informe número de dependentes: ");
		int dependentes = sc.nextInt();

		float comissao = calcularComissao(totalVendas);
		float salarioBruto = calcularSalarioBruto(salarioBase, comissao);
		float bonus = calcularBonus(totalVendas);
		float inss = calcularINSS(salarioBruto);
		float irpf = calcularIRPF(salarioBruto);
		float salarioFamiliar = calcularSalarioFamiliar(dependentes, salarioBruto);
		float salarioLiquido = calcularSalarioLiquido(salarioBruto, irpf, inss, bonus, salarioFamiliar);

		folhaPagamento(nome, salarioBase, totalVendas, comissao, salarioBruto, bonus, salarioFamiliar, irpf, inss, salarioLiquido, dependentes );
	}
	public static float calcularComissao(float totalVendas) {
		if(totalVendas > 50000) {
			totalVendas *=  (2 / 100);
		}else if(totalVendas > 100000) {
			totalVendas *= ( 5 / 100);
		}else if(totalVendas > 150000) {
			totalVendas *= (7 / 100);
		}
		return totalVendas;
	}
	public static float calcularSalarioBruto(float salarioBase, float comissao) {
		return salarioBase + comissao;
	}
	public static float calcularBonus(float totalVendas){
		float bonus = 0;
		bonus = (totalVendas >= 100000)? 1000 : 0;
		return bonus;
	}
	public static float calcularINSS(float salarioBruto) {
		float inss = 0;
		double teto = 0;
		if(salarioBruto <= 965.67) {
			inss = salarioBruto * (8/100);
		}else if(salarioBruto <= 1609.45) {
			inss = salarioBruto * (9/100);
		}else if(salarioBruto <= 3218.90) {
			inss = salarioBruto * (11/100);
		}else {
			teto = 3218.90 * (11/100);
			inss = (float)teto;
		}
		return inss;
	}
	public static float calcularIRPF(float salarioBruto){
		double irpf = 0;
		if(salarioBruto > 1434.59) {
			irpf = (salarioBruto * (7.5 / 100) ) - 107.59;
		}else if(salarioBruto > 2150.00){
			irpf = (salarioBruto * (15 / 100) ) - 268.84;
		}else if(salarioBruto > 2866.70){
			irpf = (salarioBruto * ( 22.5 / 100)) - 483.84;
		}else if(salarioBruto > 3582){
			irpf = (salarioBruto * (27.5 / 100)) - 662.94;
		}else {
			irpf = 0;
		}
		return (float)irpf;
	}
	public static float calcularSalarioFamiliar(int dependentes, float salarioBruto){
		float salarioFamilar = 0;
		if(salarioBruto <= 10000) {
			salarioFamilar = dependentes * 405;
		}else if(salarioBruto <= 20000) {
			salarioFamilar = dependentes * 210;
		}else{
			salarioFamilar = 0;
		}
		return salarioFamilar;
	}
	public static float calcularSalarioLiquido(float sb, float irpf, float inss, float bonus, float sf) {
		return sb - irpf - inss + bonus + sf;
	}

	public static void folhaPagamento(String n, float sbase, float tv, float c, float sbruto, float b, float sf, float ir, float in, float sl, int dp) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\033\143");
		System.out.printf("\n-----------------------------------\n");
		System.out.printf("\n    **** FOLHA DE PAGAMENTO ****   \n");
		System.out.printf("\n-----------------------------------\n");
		System.out.printf("  Nome..................: %3s ",n);
		System.out.printf("\n Salário Base.........: %3.2f ", sbase);
		System.out.printf("\n Total de vendas......: %3.2f ", tv);
		System.out.printf("\n-----------------------------------\n");
		System.out.printf(" Comissão...............: %3.2f ", c);
		System.out.printf("\n Salario bruto........: %3.2f ", sbruto);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Bônus..................: %3.2f ", b);
		System.out.printf("\n Salário família......: %3.2f ", sf);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" IRRF...................: %3.2f ", ir);
		System.out.printf("\n INSS.................: %3.2f ", in);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Salário líquido........: %3.2f ", sl);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Obs: Nº de dependentes : %3d", dp);
		System.out.printf("\n------------------------------------\n");
		System.out.println("Pressione ENTER para voltar!!");
		clearBuffer(sc);
	}
	public static void main(String[] args){

		while(true) {
			menu();
		}
	}

}
