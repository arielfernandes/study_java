package src.entity.cliente;
import src.entity.veiculo.*;
import java.util.Date;

public abstract class Cliente {
	private int id;
	private String nome;
	private String celular;
	private String email;
	private Date dataCadastro;

	public Veiculo veiculo;

	public void add(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public void remove(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) { this.nome = nome; }

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
