import java.util.*;

public class exerc18 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe seu sálario: ");
		float salario = read.nextFloat();
		System.out.println("Informe o valor do financiamento: ");
		float finan = read.nextFloat();

		float valor =salario * 5;

		if(finan <= valor) {
			System.out.println("Financiamento Concedido. (salario*5:"+valor+" )");
			System.out.println("Financiamento no valor de "+ finan);
		}else {
		   	System.out.printf("\nFinanciamento Negad. (salario*5: %.3f \nFinanciamento: %.3f)\n",valor, finan);
		}

		System.out.println("Obrigado por nos consultar.");
	}
}
