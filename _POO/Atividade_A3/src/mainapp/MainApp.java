package src.mainapp;

import src.entity.cliente.*;
import src.entity.veiculo.*;
import src.entity.modelo.*;

public class MainApp {
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Luiza");

		System.out.println(pf1.getNome());
	}
}

