import java.util.*;

public class exerc01 {

	static int addNumero(){
		int b = 1;
		int x = b;
		System.out.println(x);
		return 0;
	}	

	static int addNum() {
		int x = 0;
		if(x == 0){
			x = 1;
			System.out.println(x);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("insira o digito 1: ");
		int x = read.nextInt();
		System.out.println(x);

		addNumero();
		addNum();

	}
}
