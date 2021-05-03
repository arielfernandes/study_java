package src.entity.cliente;

import java.util.List;

public class Pontuacao {
    private static int quantidade;

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Pontuacao.quantidade = quantidade;
    }


    public int adicionar(int qtd) {
        this.quantidade += qtd;
        return this.quantidade;
    }
    public int subtrair(int qtd) throws ExceptionInInitializerError {
        this.quantidade -= qtd;
        return this.quantidade;
    }

    public int saldo() {
        return quantidade;
    }
}
