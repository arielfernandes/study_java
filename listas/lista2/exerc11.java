import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class exerc11 {
	public static void main(String[] args) {
		//pegando data do sistema
		Calendar year = GregorianCalendar.getInstance();
		//passando somente o ano
		int y = year.get(Calendar.YEAR);

		Scanner read = new Scanner(System.in);
		int nasc, idade = 0;

		System.out.printf("Informe o ano de seu nascimento: ");
		nasc = read.nextInt();
		

		idade = y - nasc;
		if(idade >= 16) System.out.printf("\nSua idade é maior ou igual a %d \nVocê já pode votar.\n", idade);
		if(idade >= 18) System.out.printf("\nVocê já pode tirar sua CNH.\n");


	}
}
