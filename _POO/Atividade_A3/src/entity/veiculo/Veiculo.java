package src.entity.veiculo;
import src.entity.modelo.*;
public class Veiculo {
	private int id;
	private String placa;
	private String observacao;



	private Cor cor;
	private Modelo modelo;

	public Veiculo() {
	}

	public Veiculo(String placa, Modelo modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Veiculo{" +
				"id=" + id +
				", placa='" + placa + '\'' +
				", observacao='" + observacao + '\'' +
				", cor=" + cor +
				", modelo=" + modelo +
				'}';
	}


}


