import java.util.*;

public class exerc9 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

		System.out.printf("\nInforme seu nome: ");
		String nome = read.next();
		int sexo = 0;

		System.out.printf("\nInforme seu genero | 1 - Masc | 2 - Femi |: ");
		sexo = read.nextInt();
		
		do{
			if(sexo != 1 && sexo != 2){
				System.out.printf("\nInforme seu genero |1 - Masc |2 - Femi |: "); 
				sexo = read.nextInt();
			}else {
				break;
			}
		}while(true);

		if(sexo == 1)System.out.printf("\nSr. %s.\n",nome);
		else System.out.printf("\nSra. %s.\n",nome);

	}
}
