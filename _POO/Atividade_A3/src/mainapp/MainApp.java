package src.mainapp;

import java.util.*;
import java.text.*;

import src.entity.cliente.*;
import src.entity.veiculo.*;
import src.entity.modelo.*;

public class MainApp {
	public static void main(String[] args)  throws ParseException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("999.9999.999-999/000");
		pj1.setCelular("(48)9999-9999");
		pj1.setId(1111);
		pj1.setNome("José Arruda");
		pj1.setEmail("email@email.com");
		pj1.setInscricaoEstadual("Algo");
		Date dn = sdf.parse("02/05/2021");
		pj1.setDataCadastro(dn);

		Veiculo v1 = new Veiculo();
		v1.setId(1111);
		v1.setPlaca("jjj-000");
		v1.setObservacao("Carro");

		Cor c1 = new Cor();
		c1.setId(2222);
		c1.setNome("Azul");


		Marca ma1 = new Marca("BMW");
		ma1.setId(2222);

		Modelo m1 = new Modelo("Pequeno", ma1);
		m1.setId(22222);
		m1.setDescricao("Carro");

		v1.setCor(c1);
		v1.setModelo(m1);
		pj1.add(v1);

		System.out.println(pj1.getDados());
		System.out.println(pj1.toString());

/*
		PessoaFisica pf1 = new PessoaFisica();

		pf1.setNome("Luiza");
		pf1.setCpf("000.111.222-33");
		pf1.setCelular("(48)99999-999");
		pf1.setEmail("email@email.com");
		pf1.setId(1111);
		Date dn = sdf.parse("17/05/1995");
		pf1.setDataNascimento(dn);

		pf1.getDados();

		System.out.println(pf1.getDados());
	*/
	}
}

