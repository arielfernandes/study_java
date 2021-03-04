import java.util.*;

public class temperatura{
	public static int celsius(int f) {
		//retorna fahrenheit
		return (f - 32) * 5/9;
	}
	public static int fahrenheit(int c) {
		//retorna celsius
		return (c * 9/5) + 32;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nConverter Celsius para Fahrenheit digite 1\nConverter Fahrenheit para Celsius digite 2\n");
		int resp = sc.nextInt();
		System.out.println("Informe a temperatura: ");
		int temp = sc.nextInt();

		switch (resp) {
			case 1:
				System.out.println("Temperatura em Fahrenheit: " +  fahrenheit(temp) + "°F");
				break;
			case 2:
				System.out.println("Temperatura em Celsius: " +  celsius(temp) + "°C");
				break;

			default: 
				System.out.println("Opção Inválida!");
		}

	}

}
