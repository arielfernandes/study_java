import java.util.*;
import java.math.*;

public class calcularTaxa {

	public static float calculaTaxa(float horas) {
		//float taxaMinima = 2; //taxa minima por até três horas
		double  taxaAdicional = 0.5; //taxa adicional após três horas
		//float taxaMaxima = 10; //taxa para qualquer dado período de 24h
		String m = "";
		float x = 0, t = 0;
		
		if(horas == 3) {
			x  = 2;
			m = "Taxa Miníma";
			t = x;
		}else if(horas > 3 && horas < 24) {
			float horasMais = horas - 3;
			x =  horasMais * (float) taxaAdicional;
			m = "Hora adicional";
			t = x + 2;
		}else if(horas >= 24) {
			x =  10;
			m = "Período de 24h";
			t = x;
		}

		System.out.printf("\n[Taxa Miníma 3h | valor R$ 2,00]\nQuantidade de horas: %.0fh\n%s: R$ %.2f\nTotal: R$ %.2f\n",horas, m, x, t);
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de horas: ");
		float horas = sc.nextFloat();

		calculaTaxa(horas);
	}

}
