import java.util.*;

public class exerc19 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe o indice de poluição: ");
		float indice = read.nextFloat();

		if(indice <= 0.25){
			System.out.println("O índice de poluição aceitável.");
		}else if(indice >= 0.3 && indice < 0.4){
			System.out.println("1º grupo necessita suspender suas atividades.");
		}else if(indice >= 0.4 && indice < 0.5){
			System.out.println("1º grupo e 2º, necessitam suspender suas atividades.");
		}else{
			System.out.println("Todos os grupos devem paralisar suas atividades.");
		}
	}
}
