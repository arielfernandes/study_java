package model.entity;

import java.util.Scanner;

public class Main {
	public static void mostrarVeiculo(Veiculo v) {
		System.out.println("Veiculo");
		System.out.println("ID: " + v.getId());
		System.out.println("Placa: " + v.getPlaca());
		System.out.println("Obs:" + v.getObs());
		System.out.println("Cor");
		System.out.println("Cor: " + v.getCor().getNome());
		System.out.println("ID:" + v.getCor().getId());
		System.out.println("Modelo");
		System.out.println("Descrição: " + v.getModelo().getDesc());
		System.out.println("ID: " + v.getModelo().getId());
		System.out.println("Marca");
		System.out.println("Marca: " + v.getModelo().getMarca().getNome());
		System.out.println("ID: " + v.getModelo().getMarca().getId());


	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
	
		Marca ma = new Marca("BMW");
		ma.setId(2222);

		Modelo m = new Modelo("X3", ma);
		m.setId(3333);

		Cor c = new Cor("Vemelho");
		c.setId(4444);
		
		Veiculo v = new Veiculo("GHF390", m);
		v.setObs("Um carro");
		v.setId(1111);

		v.setCor(c);
		

		mostrarVeiculo(v);

	}
}
