import java.util.Scanner;
public class JavaPOOBasico {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Controle de funcionarios");

		Cargo c1 = new Cargo();
		System.out.println("Cadastro de cargo");
		System.out.println("codigo: ");
		c1.setCodigo(scan.nextInt());
		System.out.print("Nome: ");
		c1.setNome(scan.next());
		System.out.print("Piso salarial: ");
		c1.setPisoSalarial(scan.nextFloat());
		System.out.println("");
		System.out.println(c1.toString());
		
	}
}
