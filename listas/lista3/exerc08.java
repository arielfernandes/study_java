import java.util.*;

public class exerc08 {
	static void age(){
		int age = 20;
		if (age >= 65) {
			System.out.println("Age greater than or equal to 65.");
		} else {
			System.out.println("Age is less than 65;");
		}
	}
	static void total() {
		int x = 1;
		int total = 0;
		System.out.println("-------------------------");
		while (x <= 100) {
			total += x;
			System.out.println(total);
			++x;
		}
	}
	static void TestWhile(){
		int y = 1;
		System.out.println("-------------------------");
		while (y > 0) {
			System.out.println(y);
			++y;
			if (y == 10000)
				break;
		}
	}
	public static void main(String[] args) {
		age();
		total();
		TestWhile();
	}

}
