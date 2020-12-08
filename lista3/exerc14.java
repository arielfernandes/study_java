import java.util.*;

public class exerc14 {
	public static int somar(int x, int y) {

		return x + y;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int x = 15, y = 5;
		if(x % 2 == 1 && y % 2 == 1) {
			int resultado = somar(x, y);
			System.out.println("O resultado é = " + resultado);
		}else {
			System.out.println("Valores não aceitos!!");
		}
	}
}
