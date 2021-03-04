import java.util.*;

public class exerc06 {
	static int genero(){
		int genero = 1;
		if (genero == 1) {
			System.out.println("Feminino.");
		} else {
			System.out.println("Masculino.");
		}
		return 0;
	}
	public static void main(String[] args) {
		int c = 1;
		int produto = 1;
		while( c <= 5) {
			produto *= c;
			System.out.println(produto);
			++c;
		}
		genero();
	}
}
