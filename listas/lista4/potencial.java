import java.util.*;

public class potencial {
	public static int potencialInteiro(int a, int b) {
		b = (b == 0) ? 1 : b;
		int aux = 1;
		for (int i = 0; i < b; i++) {
				aux *= a;
		}
		return aux;
	}
	public static void main(String[] args) {
		int a = 4, b = 3;

		System.out.println("Resultado: " + potencialInteiro(a, b));
	
	}

}
