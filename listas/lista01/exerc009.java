import java.util.*;

public class exerc009 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float diametro, circu, r, area;
		System.out.printf("Informe o raio de um circulo.....: ");
		r = read.nextFloat();

		diametro = 2*r;
		area = (float) (Math.PI * r * r);
		circu = (float) ((2 * Math.PI) * r);

		System.out.printf("O raio inserio: %3.2f\n", r);
		System.out.printf("O Diametro é de: %3.2f \n", diametro);
		System.out.printf("A area: %3.2f\n", area);
		System.out.printf("A circuferência: %3.2f\n", circu);

	}

}
