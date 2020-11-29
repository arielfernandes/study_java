import java.util.*;

public class exerc17 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe o peso do peixe: ");
		float peso = read.nextFloat();
		
		if(peso > 50) {
			float diferenca = peso - 50;
			float preco = diferenca * 4;
			System.out.printf("\nO peso do peixe é: %3.2f Kg.\nA difernça pela tabela: %3.2f Kg.\nPreço final: R$ %3.2f\n", peso, diferenca, preco);
		}else {
			System.out.printf("\nO peixe não excede o peso da tabela\nPeso do peixe: %3.2f Kg.\n",peso);
		}
	}
}
