package src.entity.modelo;

public enum ECategoria {
	PEQUENO(1,"Veículo Pequeno"), MEDIO(2,"Veículo Médio"), GRANDE(3,"Veículo Grande"),
	MOTO(4,"Veículo Moto"), PADRAO(0,"Veículo Padrão");

	private String descricao;
	private int valor;

	ECategoria(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	public int getValor() {
		return valor;
	}
	public String getDescricao(){
		return descricao;
	}

}

