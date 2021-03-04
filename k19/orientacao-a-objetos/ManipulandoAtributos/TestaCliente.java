class TestaCliente {
	public static void main(String[] args) {
		/*
		Cliente c1 = new Cliente();

		c1.nome = "Rafael";
		c1.codigo = 1;

		Cliente c2 = new Cliente();

		c2.nome = "Jonas";
		c2.codigo = 2;

		System.out.println(c1.nome);
		System.out.println(c1.codigo);

		System.out.println(c2.nome);
		System.out.println(c2.codigo);

		CartaoDeCredito cdc1 = new CartaoDeCredito();
		cdc1.numero = 111111;
		cdc1.dataDeValidade = "01/01/2013";

		CartaoDeCredito cdc2 = new CartaoDeCredito();
		cdc2.numero = 222222;
		cdc2.dataDeValidade = "01/01/2014";

		System.out.println(cdc1.numero);
		System.out.println(cdc1.dataDeValidade);

		System.out.println(cdc2.numero);
		System.out.println(cdc2.dataDeValidade);

		Agencia a1 = new Agencia();
		a1.numero = 1234;

		System.out.println(a1.numero);

		Conta c = new Conta();

		c.deposita(1000);
		c.imprimeExtrato();

		c.saca(100);
		c.imprimeExtrato();

		double saldoDisponivel = c.consultaSaldoDisponivel();

		System.out.println("Saldo Disponivel: " + saldoDisponivel);

		Funcionario f  = new Funcionario();
		f.aumentaSalario(800);
		System.out.println(f.consultarSalario());

		Gerente g = new Gerente();
		g.salario = 1000;

		System.out.println("Salário: " + g.salario);

		System.out.println("Aumentando o salário em 10%");
		g.aumentaSalario();

		System.out.println("Salário: " + g.salario);

		System.out.println("Aumentando o salário em 30%");
		g.aumentaSalario(0.3);

		System.out.println("Salário: " + g.salario);

		CartaoDeCredito cdc = new CartaoDeCredito(1111);
		Agencia a = new Agencia(1234);
		Conta c = new Conta(a);
		*/
		Agencia a = new Agencia(1234);
		Conta origem = new Conta(a);
		origem.saldo = 1000;

		Conta destino = new Conta(a);
		destino.saldo = 1000;

		origem.transfere(destino, 500);

		System.out.println(origem.saldo);
		System.out.println(destino.saldo);
	}
}
