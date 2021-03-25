package src.entity.cliente;
import src.entity.veiculo.*;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Cliente implements ICliente {
	private int id;
	private String nome;
	private String celular;
	private String email;
	private Date dataCadastro;

	public Veiculo veiculo;

	private List<Veiculo>ListaVeiculo = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Veiculo> getListaVeiculo() {
		return ListaVeiculo;
	}

	public void setListaVeiculo(List<Veiculo> listaVeiculo) {
		ListaVeiculo = listaVeiculo;
	}

	public void add(Veiculo veiculo) {
		if (this.veiculo == null) {
			this.ListaVeiculo = new ArrayList<>();
		}
		this.ListaVeiculo.add(veiculo);
	}

	public void remove(Veiculo veiculo) {
		if (this.ListaVeiculo != null) {
			this.ListaVeiculo.remove(veiculo);
		}
	}
	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID..................: ");
		sb.append(this.getId());
		sb.append("\n");
		sb.append("Nome................: ");
		sb.append(this.getNome());
		sb.append("\n");
		sb.append("Email...............: ");
		sb.append(this.getEmail());
		sb.append("\n");
		sb.append("Celular.............: ");
		sb.append(this.getCelular());
		sb.append("\n");
		sb.append("Data de cadastro....: ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");
		sb.append(sdf.format(this.getDataCadastro()));
		sb.append("\n");
		sb.append("Veiculos do cliente: \n");
		int cont = 0;
		if (this.getListaVeiculo() != null) {
			for (Veiculo v: this.getListaVeiculo()) {
				sb.append(++cont);
				sb.append(" - ");
				sb.append(v.getPlaca());
				sb.append(" - ");
				sb.append(v.getCor().getNome());
				sb.append(" - ");
				sb.append(v.getModelo().getDescricao());
				sb.append(" - ");
				sb.append(v.getModelo().getCategoria().getDescricao());
				sb.append(" - ");
				sb.append(v.getModelo().getMarca().getNome());
				sb.append("\n");
			}
		} else {
			sb.append("Não há veículos registrados...");
		}

		return sb.toString();
	}
}