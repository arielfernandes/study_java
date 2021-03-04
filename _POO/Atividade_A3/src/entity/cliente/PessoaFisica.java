package src.entity.cliente;
import java.util.Date;
import java.text.*;
import java.util.SimpleTimeZone;

public class PessoaFisica extends Cliente {
	private String cpf;
	private Date dataNascimento;

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

	@Override
	public String getDados() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(getNome());
		sb.append("\n");
		sb.append("CPF: ");
		sb.append(this.getCpf());
		sb.append("\n");
		sb.append("Celular: ");
		sb.append(getCelular());
		sb.append("\n");
		sb.append("Email: ");
		sb.append(getEmail());
		sb.append("\n");
		sb.append("Data de Nascimento: ");
		sb.append(sdf.format(getDataNascimento()));
		sb.append("\n");
		sb.append("Veiculos, Pessoa Juridica: ");
		//sb.append(getListaVeiculos());
		return sb.toString();
	}

	@Override
	public String getDados(String Observacao) {
		return null;
	}
}

