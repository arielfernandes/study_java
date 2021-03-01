package model.entity;

public class Veiculo {
	private int id;
	private String placa;
	private String obs;
	
	private Cor cor;
	private Modelo modelo;
	
	public Veiculo() {
	}

	public  Veiculo(String placa) {
		this.setPlaca(placa);
	}

	public  Veiculo(String placa, Modelo modelo) {
		this(placa);
		this.setModelo(modelo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Modelo getModelo() {
		return modelo;
	}



}
