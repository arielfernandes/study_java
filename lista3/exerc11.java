import java.util.*;

public class exerc11 {
	static float calcSalario(float salarioHora, float horaTrab) {
		float salarioBruto = 0, salarioNormal = 0, total = 0;


		if(horaTrab <= 40) {
			salarioNormal = salarioHora * horaTrab;
			System.out.printf("\n--- Hora normal ---\nSálario (normal): R$ %.2f\n", salarioNormal);
		}else {
			salarioBruto = (salarioHora * horaTrab) * (100 / 50);
			System.out.println("--- Com  hora extra ---");
			System.out.printf("\nSalario sem hora extra: R$ %.2f\nSalario Bruto: %.2f\n\n",(salarioHora * horaTrab), salarioBruto);
		}
		return total += salarioNormal + salarioBruto;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float total = 0;
		while(true) {
			System.out.println("------------");
			System.out.println("Informe o salário hora: ");
			float salarioHora = read.nextFloat();
			System.out.println("Informe as horas trabalhadas: ");
			float horaTrab = read.nextFloat();

			total += calcSalario(salarioHora, horaTrab);

			System.out.println("Deseja continuar? 1 - sim / 2 - não");
			int resp = read.nextInt();
			if(resp == 2) {
				System.out.printf("\nTotal paga em salário: %.2f\n", total);
				break;
			}else 
				System.out.printf("\n-------------\n");
		}
	}
}
