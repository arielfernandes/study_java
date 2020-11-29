import java.util.*;

public class exerc7 {
	static float media(float n1, float n2, float n3, float n4){
		float m;
		m = (n1 + n2 + n3 + n4) / 4;
		return m;
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Informe a nota do aluno: ");
		float n1 = read.nextFloat();

		System.out.println("Informe a nota do aluno: ");
		float n2 = read.nextFloat();

		System.out.println("Informe a nota do aluno: ");
		float n3 = read.nextFloat();

		System.out.println("Informe a nota do aluno: ");
		float n4 = read.nextFloat();

		float m = media(n1, n2, n3, n4);

		String ap = (m >= 6) ? "Aprovado" : "Reprovado";

		System.out.printf("O aluno foi %s com média %.2f.\n", ap, m);

		if( ap == "Reprovado") {
			System.out.println("Informe a nota de recuperação: ");
			float r = read.nextFloat();
			m += r;
			if(m > 10) m = 10;
			ap = (m >= 6) ? "Aprovado" : "Reprovado";
			System.out.printf("(Recuperação) O aluno foi %s com média %.2f.\n", ap, m);
		}

	}
}
