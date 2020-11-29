import java.util.*;

public class exerc10 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		float altura, peso;
		double imc = 00.0;
		int sexo;

		System.out.printf("Informe seu genero | 1 - Masculino || 2 - Feminino |: ");
		sexo = read.nextInt();

		System.out.printf("\nInforme sua altura: ");
		altura  = read.nextFloat();

		System.out.printf("\nInforme seu peso: ");
		peso = read.nextFloat();

		if(sexo == 1) {
			imc = (72 * altura) - 58;
		}else if(sexo == 2) {
			imc = (72 * altura) - 44.7;
		}
		
		System.out.printf("Seu IMC é: %.2f\n", imc);
	}
}
