class Funcionario {
	double salario = 1000.0;
	int codigo;

	void aumentaSalario(double aumento) {
		this.salario += aumento;
	}
	double consultarSalario() {
		return this.salario;
	}
}


