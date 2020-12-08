import java.util.*;

public class HorasSegundos {
	public static float conversor(float a, float b, float c) {
		float segundos = 0;
		a *= 3600;
		b *= 60;
		return segundos = a + b + c;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float horas = 0, minutos = 0, segundos = 0;
		
		System.out.println("Converta horas em segundos");
		System.out.println("Insira horas: ");
		horas = sc.nextFloat();
		
		System.out.println("Insira minutos: ");
		minutos = sc.nextFloat();

		System.out.println("Insira segundos: ");
		segundos = sc.nextFloat();

		System.out.println("Horas em segundos: " + conversor(horas, minutos, segundos) + "s");
	}
}
