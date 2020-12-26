public class banco {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("-------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	// Métodos Especiais
	public banco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public String getDono() {
		return this.dono;
	}
	public void setSaldo(float s) {
		this.saldo = s;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setStatus(boolean x) {
		this.status = x;
	}
	public boolean getStatus() {
		return this.status;
	}
	// Métodos
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if ("CC".equals(t)) {
			this.setSaldo(50);
		}else if ("CP".equals(t)){
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta ainda com dinheiro");
		}else if (getSaldo() < 0) {
			System.out.println("Conta em débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()){
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	public void pagarMensal() {
		float v = 0;
		if ("CP".equals(this.getTipo())) {
			v = 12;
		}else if ("CP".equals(this.getTipo())) {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + getDono());
			}
		}else {
			System.out.println("Impossível pagar");
		}
	}
}
