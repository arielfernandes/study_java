package src.entity.cliente;

public class Relatorio {
    public String imprimir (Cliente cliente) {
        StringBuilder sb = new StringBuilder();
        if (cliente instanceof PessoaFisica) {
            sb.append("**** Pessoa Física ****").append("\n");
        }else {
            sb.append("**** Pessoa Juridica *****").append("\n");
        }
        sb.append(cliente.getDados());
        return sb.toString();
    }
}
