package src.mainapp;

import java.util.*;
import java.text.*;

import src.entity.cliente.*;
import src.entity.veiculo.*;
import src.entity.modelo.*;

public class MainApp {
	public static void main(String[] args)  throws ParseException {
		Scanner scan = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Cor cor = new Cor();
		System.out.println("****** Cadastro da cor ******");
		System.out.println("Id.......: ");
		cor.setId(scan.nextInt());
		System.out.println("Nome.......: ");
		cor.setNome(scan.next());

		Marca m = new Marca();
		System.out.println("****** Cadastro da Marca ******");
		System.out.println("Id......: ");
		m.setId(scan.nextInt());
		System.out.println("Nome.....: ");
		m.setNome(scan.next());

		Modelo modelo = new Modelo();
		System.out.println("****** Cadastro do Modelo ******");
		System.out.println("Id......: ");
		modelo.setId(scan.nextInt());
		System.out.println("Descrição......: ");
		modelo.setDescricao(scan.next());
		modelo.setMarca(m);

		System.out.println("Selecione o tipo de categoria: \n" +
				"1 - PEQUENO\n2  - MEDIO\n3 - GRANDE\n4 - MOTO\n0 - PADRAO ");
		int temp = scan.nextInt();
		switch (temp) {
			case 1: modelo.setCategoria(ECategoria.PEQUENO);break;
			case 2: modelo.setCategoria(ECategoria.MEDIO);break;
			case 3: modelo.setCategoria(ECategoria.GRANDE);break;
			case 4: modelo.setCategoria(ECategoria.MOTO);break;
			case 0: modelo.setCategoria(ECategoria.PADRAO);break;
			default: modelo.setCategoria(ECategoria.PADRAO);
		}

		Cliente cliente = new PessoaFisica();
		System.out.println("**** Cadastro do Cliente ****");
		System.out.println("Id.................: ");
		cliente.setId(scan.nextInt());
		System.out.println("Nome...............: ");
		cliente.setNome(scan.next());
		System.out.println("Celular............: ");
		cliente.setCelular(scan.next());
		System.out.println("Email..............: ");
		cliente.setEmail(scan.next());
		System.out.println("Data de Cadastro...: ");
		String strTmp = scan.next();
		cliente.setDataCadastro(sdf.parse(strTmp));
		if (cliente instanceof  PessoaFisica) {
			System.out.println("CPF................: ");
			//operação de cast
			((PessoaFisica) cliente).setCpf(scan.next());
			System.out.println("Data de Nasc.......: ");
			strTmp = scan.next();
			((PessoaFisica) cliente).setDataNascimento(sdf.parse(strTmp));
		} else {
			System.out.println("CNPJ................: ");
			//operação de cast
			((PessoaJuridica) cliente).setCnpj(scan.next());
			System.out.println("IE..................: ");
			((PessoaJuridica) cliente).setInscricaoEstadual(scan.next());
		}
		Veiculo v1 = new Veiculo();
		System.out.println("**** Cadastro do Veiculo *****");
		System.out.println("Id..........:");
		v1.setId(scan.nextInt());
		System.out.println("Placa.......:");
		v1.setPlaca(scan.next());
		System.out.println("Observação..:");
		v1.setObservacao(scan.next());

		v1.setCor(cor);
		v1.setModelo(modelo);
		v1.setCliente(cliente);
//cliente.add(v1);

		Veiculo v2 = new Veiculo();
		System.out.println("**** Cadastro do Veiculo *****");
		System.out.println("Id..........:");
		v2.setId(scan.nextInt());
		System.out.println("Placa.......:");
		v2.setPlaca(scan.next());
		System.out.println("Observação..:");
		v2.setObservacao(scan.next());

		v2.setCor(cor);
		v2.setModelo(modelo);
		v2.setCliente(cliente);



		imprimir(cliente);

	}
	/*
		exemplo de método que implementa o polimorfismo, pois o parâmetro cliente
		aceita tanto PF quanto PJ.
	*/
	private static void imprimir(Cliente c){
		System.out.println("**** Dados do cliente e seus veículos ****");
		System.out.println(c.getDados());
	}
}

