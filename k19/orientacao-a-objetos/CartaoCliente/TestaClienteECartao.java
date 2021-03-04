class TestaClienteECartao {
	public static void main(String[] args) {
		/*
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();

		c.nome = "Rafael Cosentino";
		cdc.numero = 111111;

		// Ligando os objetos
		cdc.cliente = c;

		System.out.println(cdc.numero);
		System.out.println(cdc.cliente.nome);
		*/
		Agencia a = new Agencia();
		Conta c = new Conta();

		a.numero = 178;
		c.saldo = 1000.0;
		c.agencia = a;

		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);
	}

}
