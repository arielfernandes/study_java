import java.util.*;

public class exerc04 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int c = 0;
		int c1 = 0;
		int c2 = 0;
		int y = 0;

		for (int x = 0; x < 5; x++) {
			System.out.println("Informe um número: ");
			y = read.nextInt();
			System.out.println("valor y = " + y);
			System.out.println("valor x = " + x);
			if (y < 0) {
				c++;
			} else if (y == 0) {
				c1++;
			}else if (y > 0) {
				c2++;
			}
		}
		System.out.printf("\nNegativos: %d\nPositivios: %d\nZeros: %d\n", c, c2, c1);

	}
}
