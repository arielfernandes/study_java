import java.util.Scanner;

public class MainApp {
	public static void mostrarVeiculos(Veiculo v) {
		System.out.println("***********************");
		System.out.println("******* Veículo *******");
		System.out.println("--------------------------------");
		System.out.println("ID Modelo: " + v.getModelo().getId());
		System.out.println("Modelo: " + v.getModelo().getDescricao());
		System.out.println("--------------------------------");
		System.out.println("ID Veiculo: " + v.getId());
		System.out.println("Placa: " + v.getPlaca());
		System.out.println("--------------------------------");
		System.out.println("ID Marca: " + v.getModelo().getMarca().getId());
		System.out.println("Marca: " + v.getModelo().getMarca().getNome());
		System.out.println();

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Marca m1 = new Marca();
		Modelo md1 = new Modelo();
		Veiculo v1 = new Veiculo();

		System.out.println("Cadastro de veículos");
		//Veiculo
		System.out.println("Veiculo");
		System.out.print("Informe o ID: ");
		v1.setId(scan.nextInt());
		System.out.print("Informe a placa: ");
		v1.setPlaca(scan.next());
		//Modelo
		System.out.println("Modelo ");
		System.out.print("Informe o ID: ");
		md1.setId(scan.nextInt());
		System.out.print("Informe uma descricao: ");
		md1.setDescricao(scan.next());
		//Marca
		System.out.println("Marca ");
		System.out.print("Informe o ID: ");
		m1.setId(scan.nextInt());
		System.out.print("Informe o nome: ");
		m1.setNome(scan.next());

		System.out.println();
		//System.out.println("Iforme a placa do veículo: ");
		v1.setModelo(md1);
		v1.getModelo().setMarca(m1);
		mostrarVeiculos(v1);

		Marca m2 = new Marca();
		Modelo md2 = new Modelo();
		Veiculo v2 = new Veiculo();
		v2.setPlaca("P9191");
		v2.setId(1234);

		md2.setId(3333);
		md2.setDescricao("marrom");
		
		m2.setId(4444);
		m2.setNome("Punto");

		v2.setModelo(md2);
		v2.getModelo().setMarca(m1);
		mostrarVeiculos(v2);

	}

}
