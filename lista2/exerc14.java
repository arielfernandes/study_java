import java.util.*;

public class exerc14 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float salario1, salario2, horas1, horas2;

		System.out.println("Informe a quantidade de horas do 1º prof:  ");
		horas1 = read.nextFloat();
		System.out.println("Informe o valor por hora (1º prof):  ");
		salario1 = read.nextFloat();
	
		System.out.println("Informe a quantidade de horas do 2º prof:  ");
		horas2 = read.nextFloat();
		System.out.println("Informe o valor por hora (2º prof):  ");
		salario2 = read.nextFloat();

		salario1 *= horas1;
		salario2 *= horas2;

		System.out.printf("\nSalario 1º prof. %.2f\nSalario 2º prof. %.2f", salario1, salario2 );

		if(salario1 > salario2){System.out.printf("\nO prof. 1º recebe mais, seu salario %.2f", salario1);}
		else if(salario1 < salario2){System.out.printf("\nO prof. 2º recebe mais, seu salario %.2f", salario2);}
		else {System.out.printf("\nOs salarios são iguais\n1º Prof. %.2f\n2º Prof. %.2f\n", salario1, salario2);}
		System.out.printf("\n");
	}

}
