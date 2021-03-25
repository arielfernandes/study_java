package src.entity.cliente;
import src.entity.veiculo.Veiculo;

import java.util.Date;
import java.text.*;
import java.util.SimpleTimeZone;

public class PessoaFisica extends Cliente {
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private String cpf;
	private Date dataNascimento;


	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder();
	//	sb.append("ID..................: ");
	//	sb.append(this.getId());
	//	sb.append("\n");
	//	sb.append("Nome................: ");
	//	sb.append(this.getNome());
	//	sb.append("\n");
	//	sb.append("Email...............: ");
	//	sb.append(this.getEmail());
	//	sb.append("\n");
	//	sb.append("Celular.............: ");
	//	sb.append(this.getCelular());
	//	sb.append("\n");
	//	sb.append("Data de cadastro....: ");

		sb.append(super.getDados());

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

		// sb.append(sdf.format(this.getDataCadastro()));

		sb.append("\n");
		sb.append("CPF.................: ");
		sb.append(this.getCpf());
		sb.append("\n");
		sb.append("Data de Nascimento..:");
		sb.append(sdf.format(this.getDataNascimento()));
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

