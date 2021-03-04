import java.util.*;
public class Exer12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean menu = true;
		Ticket t = new Ticket();
		do {
			t.menuPrincipal();
			int tipo = scan.nextInt();
			switch (tipo) {
				case 1:
				case 2:
					t.setTipoPassageiro(tipo);
					t.lerPassageiro();
					break;
				case 0:
					menu = false;
					break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
		} while (menu);
	}
}
