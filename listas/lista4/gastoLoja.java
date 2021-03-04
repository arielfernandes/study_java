import java.util.*;

public class gastoLoja{
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1) A vista com 10 % de desconto: ");
		System.out.println("2) Em duas vezes (preço da etiqueta): ");
		System.out.println("3)de 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00)");
		System.out.println("Digite 0 para sair! ");
		System.out.printf("Opção: ");
		int op = sc.nextInt();
		return op;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.printf("Informe o total gasto: ");
		float gasto = sc.nextFloat();

		int op = menu();

		switch (op) {
			case 0:
				break;
			case 1:
				float desc = gasto * 10/100;
				gasto = gasto - desc;
				System.out.println("----------------------------------------");
				System.out.println("Valor total: " + gasto);
				System.out.println("----------------------------------------");
				break;
			case 2:
				System.out.println("----------------------------------------");
				System.out.println("Valor total: " + gasto);
				System.out.println("Pagamento em 2X");
				System.out.println("----------------------------------------");
				break;
			case 3:
				float totalGasto = 0;
				System.out.println("----------------------------------------");
				System.out.println("Informe o total de parcelas: ");
				System.out.printf("Quantidade:  ");
				int parcelas = sc.nextInt();
				if(gasto > 100){
					totalGasto = gasto;
					float Valorparcelas = gasto / parcelas;
					float juros = gasto * 3/100;
					float jurosParcelas = Valorparcelas + juros;

					float total = jurosParcelas * parcelas;

					System.out.println("----------------------------------------");
					System.out.println("Valor total da compra: R$" + totalGasto);
					System.out.println("Quantidade de parcelas: " + parcelas);
					System.out.printf("Valor da parcela: R$ %.2f.\n", Valorparcelas);
					System.out.printf("Juros ao mês: R$ %.2f.\n", juros);
					System.out.printf("Valor final da parcela: R$ %.2f.\n", jurosParcelas);
					System.out.printf("Total: R$ %.2f.\n", total);
					System.out.println("----------------------------------------");
				}else {
					System.out.println("Parcelas somente acima de R$ 100,00 de compras.");
					menu();
				}
				break;
			default:
				System.out.println("Opão inválida!!");
				break;
		}
	}
}
