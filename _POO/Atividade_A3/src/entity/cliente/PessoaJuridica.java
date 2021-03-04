package src.entity.cliente;

import src.entity.veiculo.Veiculo;

import java.text.*;


public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String inscricaoEstadual;


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}


	@Override
	public String getDados() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(getNome());
		sb.append("\n");
		sb.append("CNPJ: ");
		sb.append(this.getCnpj());
		sb.append("\n");
		sb.append("Inscrição Estadual: ");
		sb.append(this.getInscricaoEstadual());
		sb.append("\n");
		sb.append("Celular: ");
		sb.append(getCelular());
		sb.append("\n");
		sb.append("Email: ");
		sb.append(getEmail());
		sb.append("\n");
		sb.append("Data de cadastro: ");
		sb.append(sdf.format(getDataCadastro()));
		sb.append("\n");
		sb.append("Veiculos, Pessoa Juridica: ");
		sb.append(getListaVeiculo());

		return sb.toString();
	}


	@Override
	public String getDados(String Observacao) {
		return null;
	}
}

