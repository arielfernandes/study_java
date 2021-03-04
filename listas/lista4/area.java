import java.util.*;
import java.math.*;

public class area {
	public static int calcularTrapezio(int a, int b, int c) {
		int result = ((a + b) * c) / 2;
		return result;
	}
	
	public static int areaQuadrado(int b) {
		return b*b;
	}

	public static int areaCubo(int c) {
		int result = 6 * (c*c);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10, b = 8, c = 15;
		
		int areaTrapezio = calcularTrapezio(a, b, c);
		System.out.printf("\nÁrea do trapézio = %d.\n", areaTrapezio);

		int areaQuadrado = areaQuadrado(b);
		System.out.printf("\nÁrea do quadrado = %d.\n", areaQuadrado);

		int areaDoCubo = areaCubo(c);
		System.out.printf("\nÁrea da superfície do cubo = %d.\n", areaDoCubo);
	}
}
