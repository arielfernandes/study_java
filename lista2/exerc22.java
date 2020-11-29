import java.util.*;

public class exerc22 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		int idade = read.nextInt();

		if(idade <= 5){
			System.out.println("A escola não aceita alunos com menos de 5 anos");
		}else if(idade <= 7) {
			System.out.println("Categoria infantil A");
		}else if(idade <= 11) {
			System.out.println("Categoria infantil B");
		}else if(idade <= 13) {
			System.out.println("Categoria juvenil A");
		}else if(idade <= 17) {
			System.out.println("Categoria juvenil B");
		}else { System.out.println("Categoria adulto");}
	}
}



