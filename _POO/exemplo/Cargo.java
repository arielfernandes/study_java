public class Cargo {
	private int codigo;
	private String nome;
	private float pisoSalarial;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPisoSalarial() {
		return pisoSalarial;
	}

	public void setPisoSalarial(float pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}
	

	@Override
	public String toString() {
		return "Cargo{" +
			"codigo = " + getCodigo() +
			", nome = " + getNome() +
			", pisoSalarial = " + getPisoSalarial() +
			"}";
	}

}
