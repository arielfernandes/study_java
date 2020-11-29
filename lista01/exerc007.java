import java.util.Scanner;

public class exerc007 {
	static int calc(int x, int y) {
		int soma, diferenca, produto, quociente;

		soma = x + y;
		diferenca = x - y;
		produto = x * y;
		quociente = x / y;

		System.out.println("A soma dos valores -> " + x + " + " + y + " = " + soma);
		System.out.println("A diferença dos valores -> " + x + " - " + y + " = " + diferenca);
		System.out.println("O produto dos valores -> " + x + " X " + y + " = " + produto);
		System.out.println("O quociente dos valores -> " + x + " / " + y + " = " + quociente);

		return 0;
	}
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String x, y;
		int Vx, Vy;

		System.out.printf("Digite o primeiro valor.....: ");
		x = read.next();
		System.out.printf("Digite o segundo valor.....: ");
		y = read.next();

		Vx = Integer.parseInt(x);
		Vy = Integer.parseInt(y);

		// call the method calc
		calc(Vx, Vy);
	}

}
