class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	Conta(Agencia agencia) {
		this.agencia = agencia;
	}
	void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	void deposita(double valor) {
		this.saldo += valor;
	}
	void saca(double valor) {
		this.saldo -= valor;
	}
	void imprimeExtrato() {
		//extrato dos últimos 15 dias
		System.out.println("Saldo: " + this.saldo);
		this.imprimeExtrato(15);
	}
	//Overloading imprimeExtrato
	void imprimeExtrato(int dias) {
		
	}

	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}
