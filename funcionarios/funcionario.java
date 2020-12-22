import java.util.*;

public class funcionario {


	public static void clearBuffer(Scanner sc) {
		if(sc.hasNextLine()) {
			sc.nextLine();
		}
	}
	public static boolean telaBloqueio() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nTela de Login");
		System.out.println("login > ");
		String login = in.nextLine();
		System.out.println("senha > ");
		String senha = in.nextLine();
		return getLogin(login, senha);
	}
	public static boolean getLogin(String login, String senha) {
		if(login.equals("login") && senha.equals("1234-04")){
			System.out.printf("Usuário %s logado com sucesso.", login);
			return true;
		}else{
			System.out.print("\033\143");
			System.out.println("Login ou senha inválidos!");
			return false;
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
				System.out.print("\033\143");
				if(!telaBloqueio()) {
					int cont = 0;
					do{
						if(telaBloqueio()){
							while(true) {
								menu();
							}
						}
						cont++;
					}while(cont < 3);
					System.out.print("\033\143");
					System.out.printf("\n\nSistema finalizado por tentativas inválidas!\n");
					System.exit(0);
				}
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
		System.out.println("Informe o total de vendas: ");
		double totalVendas = sc.nextDouble();
		System.out.println("Informe o sálario base: ");
		double salarioBase = sc.nextDouble();
		System.out.println("Informe número de dependentes: ");
		int dependentes = sc.nextInt();

		double comissao = calcularComissao(totalVendas);
		double salarioBruto = calcularSalarioBruto(salarioBase, comissao);
		double bonus = calcularBonus(totalVendas);
		double inss = calcularINSS(salarioBruto);
		double irpf = calcularIRPF(salarioBruto);
		double salarioFamiliar = calcularSalarioFamiliar(dependentes, salarioBruto);
		double salarioLiquido = calcularSalarioLiquido(salarioBruto, irpf, inss, bonus, salarioFamiliar);

		folhaPagamento(nome, mesAno, (float)salarioBase, (float)totalVendas,(float)comissao, (float)salarioBruto,(float)bonus,(float)salarioFamiliar,(float)irpf, (float)inss,(float) salarioLiquido,dependentes );
	}
	public static double calcularComissao(double totalVendas) {
		double total = 0;
		if(totalVendas > 150000) {
			total = totalVendas * 0.07;
		}else if(totalVendas > 100000) {
			total = totalVendas * 0.05;
		}else if(totalVendas > 50000) {
			total = totalVendas * 0.02;
		}else {
			total = 0.0;
		}
		return total;
	}
	public static double calcularSalarioBruto(double salarioBase, double comissao) {
		return salarioBase + comissao;
	}
	public static double calcularBonus(double totalVendas){
		double bonus = 0;
		bonus = (totalVendas >= 100000)? 1000 : 0;
		return bonus;
	}
	public static double calcularINSS(double salarioBruto) {
		if(salarioBruto <= 965.67) {
			salarioBruto =  salarioBruto * 0.08;;
		}else if(salarioBruto <= 1609.45) {
			salarioBruto =  salarioBruto * 0.09;
		}else if(salarioBruto <= 3218.90) {
			salarioBruto =  salarioBruto * 0.11;
		}else {
			salarioBruto = 3218.90 * 0.11;
		}
		return salarioBruto;
	}
	public static double calcularIRPF(double salarioBruto){
		double irpf = 0;
		if(salarioBruto > 1434.59) {
			irpf = (salarioBruto * 0.075) - 107.59;
		}else if(salarioBruto > 2150.00){
			irpf = (salarioBruto * 0.15) - 268.84;
		}else if(salarioBruto > 2866.70){
			irpf = (salarioBruto * 0.225) - 483.84;
		}else if(salarioBruto > 3582){
			irpf = (salarioBruto * 0.275) - 662.94;
		}else {
			irpf = 0;
		}
		return irpf;
	}
	public static double calcularSalarioFamiliar(int dependentes, double salarioBruto){
		double salarioFamilar = 0;
		if(salarioBruto <= 10000) {
			salarioFamilar = dependentes * 405;
		}else if(salarioBruto <= 20000) {
			salarioFamilar = dependentes * 210;
		}else{
			salarioFamilar = 0;
		}
		return salarioFamilar;
	}
	public static double calcularSalarioLiquido(double sb, double irpf, double inss, double bonus, double sf) {
		return sb - irpf - inss + bonus + sf;
	}

	public static void folhaPagamento(String n, String mesAno, float sbase, float tv, float comissao, float sbruto, float b, float sf, float ir, float in, float sl, int dp) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\033\143");
		System.out.printf("\n-----------------------------------\n");
		System.out.printf("\n    **** FOLHA DE PAGAMENTO ****   \n");
		System.out.printf("\n-----------------------------------\n");
		System.out.printf("\n%s",mesAno);
		System.out.printf("\n-----------------------------------\n");
		System.out.printf(" Nome...................: %3s ",n);
		System.out.printf("\n Salário Base...........: %3.2f ", sbase);
		System.out.printf("\n Total de vendas........: %3.2f ", tv);
		System.out.printf("\n-----------------------------------\n");
		System.out.printf(" Comissão...............: %3.2f ", comissao);
		System.out.printf("\n Salario bruto..........: %3.2f ", sbruto);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Bônus..................: %3.2f ", b);
		System.out.printf("\n Salário família........: %3.2f ", sf);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" IRRF...................: %3.2f ", ir);
		System.out.printf("\n INSS...................: %3.2f ", in);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Salário líquido........: %3.2f ", sl);
		System.out.printf("\n------------------------------------\n");
		System.out.printf(" Obs: Nº de dependentes : %3d", dp);
		System.out.printf("\n------------------------------------\n");
		System.out.println("Pressione ENTER para voltar!!");
		clearBuffer(sc);
	}
	public static void main(String[] args){
		int cont = 0;
		do{
			if(telaBloqueio()){
				while(true) {
					menu();
				}
			}
			cont++;
		}while(cont < 3);
		System.out.print("\033\143");
		System.out.printf("\n\nSistema finalizado por tentativas inválidas!\n");
	}
}


