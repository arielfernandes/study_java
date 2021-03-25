package src.entity.cliente;

import src.entity.veiculo.Veiculo;

import java.text.*;


public class PessoaJuridica extends Cliente {
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

	private String cnpj;
	private String inscricaoEstadual;


	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.getDados());

		sb.append("\n");
		sb.append("CPF.................: ");
		sb.append(this.getCnpj());
		sb.append("\n");
		sb.append("Inscrição Estadual..:");
		sb.append(this.getInscricaoEstadual());

		return sb.toString();
	}

	@Override
	public String getDados(String Observacao) {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDados());
		sb.append("Observações: ");
		sb.append(Observacao);
		sb.append("\n");
		return sb.toString();
	}
}

