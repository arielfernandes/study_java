/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoobasico;

import entity.Cargo;
import entity.Funcionario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class JavaPOOBasico {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Controle de funcionarios");

		Cargo c1 = new Cargo();
		System.out.println("Cadastro de cargo");
		System.out.print("codigo: ");
		c1.setCodigo(entrada.nextInt());
		System.out.print("Nome: ");
		//entrada.next();
		c1.setNome(entrada.next());
		System.out.print("Piso salarial: ");
		c1.setPisoSalarial(entrada.nextFloat());

		Cargo c2 = new Cargo();
		System.out.println("Cadastro de cargo");
		System.out.print("codigo: ");
		c2.setCodigo(entrada.nextInt());
		System.out.print("Nome: ");
		//entrada.next();
		c2.setNome(entrada.next());
		System.out.print("Piso salarial: ");
		c2.setPisoSalarial(entrada.nextFloat());

		System.out.println("Cadastro de funcionario...");

		Funcionario f1 = new Funcionario();
		//Funcionario f2 = new Funcionario();
		//List<Funcionario> listaFuncionarios;
		//instanciação por meio do método construtor de classe

		System.out.print("Matricula: ");
		//int mat = entrada.nextInt();
		f1.setMatricula(entrada.nextInt());
		System.out.print("Nome: ");
		f1.setNome(entrada.next());
		System.out.print("Salario");
		f1.setSalario(entrada.nextFloat());

		f1.setCargo(c1);

		Funcionario f2 = new Funcionario();
		//Funcionario f2 = new Funcionario();
		//List<Funcionario> listaFuncionarios;
		//instanciação por meio do método construtor de classe

		System.out.print("Matricula: ");
		//int mat = entrada.nextInt();
		f2.setMatricula(entrada.nextInt()); 
			System.out.print("Nome: ");
			f2.setNome(entrada.next());
			System.out.print("Salario");
			f2.setSalario(entrada.nextFloat()); 
			f2.setCargo(c1);
			
			mostrarDados(f1);
			mostrarDados(f2);
			
	}

		public static void mostrarDados(Funcionario f) {
			System.out.println("Dados do funcionario:");
				System.out.println("Matricula: " + f.getMatricula());
				System.out.println("Nome: " + f.getNome());
				System.out.println("Salario: " + f.getSalario());
				System.out.println("Cargo: " + f.getCargo().getNome() + " - " + f.getCargo().getPisoSalarial());
		}
	
}
