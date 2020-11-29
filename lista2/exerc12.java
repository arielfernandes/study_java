import java.util.*;

public class exerc12 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);

		int cod = 0;

		System.out.printf("Informe o código: ");
		cod = read.nextInt();

		if(cod == 1) {
			System.out.println("Alimento não-perecivel");
		}else if(cod == 2 || cod == 3 || cod == 4) {
			System.out.println("Alimento perecivel");
		}else if(cod == 5 || cod == 6) {
			System.out.println("Vestuário");
		}else if(cod == 7) {
			System.out.println("Higiene Pessoal");
		}else if(cod >= 8 && cod <= 15) {
			System.out.println("Vestuário");
		}else {
			System.out.println("Inválido");
		}
	}

}
