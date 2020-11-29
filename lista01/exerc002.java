import java.util.Scanner;
import java.util.*;
import java.lang.*;

class exerc002 {

	static int myMethod(int x,int y, int z) {
		int resultado;
		resultado = x * y * z;
		return resultado;
	}
	static void myCall(){

		Scanner ler = new Scanner(System.in);
		String xVal, yVal, zVal;

		System.out.printf("Insira o 1º valor .....: ");
		xVal = ler.next();

		System.out.printf("Insira o 2º valor .....: ");
		yVal = ler.next();

		System.out.printf("Insita o 3º valor .....: ");
		zVal = ler.next();

		int x = Integer.parseInt(xVal);
		int y = Integer.parseInt(yVal);
		int z = Integer.parseInt(zVal);

		System.out.println(myMethod(x, y, z));
	}
	public static void main(String[] args) {
		myCall();

	}
}
