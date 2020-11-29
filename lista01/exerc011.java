public class exerc011 {
	public static void main(String[] args) {

		System.out.format("%-15s%-15s%-15s\n", "Numero", "Quadrado", "cube");
		for(int i = 0; i <= 10; i++) {
			System.out.format("%-15s%-15s%-15s\n", i, i*i, Math.pow(i, 3));
		}
	}

}
