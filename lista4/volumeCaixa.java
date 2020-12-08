import java.util.*;
import java.math.*;

public class volumeCaixa {
	public static double CalcularVolume(double r, double h) {
		return  Math.PI * Math.pow(r, 2) * h;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double radius, volume, height, diameter;

		System.out.println("Informe Altura: ");
		height = sc.nextDouble();

		System.out.println("Informe o Diametro: ");
		diameter = sc.nextDouble();

		radius = diameter / 2;

		volume = CalcularVolume(radius, height);

		System.out.printf("O volume da caixa de d'água: %.2f³.\n", volume);

	}

}
