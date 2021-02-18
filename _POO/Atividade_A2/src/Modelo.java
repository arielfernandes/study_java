package model.entity;

public class Modelo {
	private int id;
	private String desc;

	private Marca marca;

	public Modelo() {
	}
	
	public Modelo(String desc) {
		this.setDesc(desc);
	}
	public Modelo(String desc, Marca marca) {
		this(desc);
		this.setMarca(marca);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Marca getMarca() {
		return marca;
	}

}
