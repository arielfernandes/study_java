package src.entity.modelo;

public enum ECategoria {
	PEQUENO("Veículo Pequeno"), MEDIO("Veículo Médio"), GRANDE("Veículo Grande"), MOTO("Veículo Moto"), PADRAO("Veículo Padrão");
	public String descricao;

	ECategoria(String descricao) {
		descricao = descricao;
	}
	public String getDescricao(){
		return descricao;
	}

}

