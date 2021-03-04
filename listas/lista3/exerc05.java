import java.util.*;

public class exerc05 {
	public static void  main(String[] args) {
		int x = 1;
		int y = 0;
		while(x <= 10) {
			y = x++;
			y += y;
			System.out.println(y);

		}
	}
}
