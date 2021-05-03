package src.entity.OS;

import src.entity.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemServico {
    private long numero;
    private double ValorTotal;
    private Date agenda;
    private double desconto;

    private ItemOS itemos;
    private EStatus status;
    private Veiculo veiculo;
    private List<ItemOS> ListItemOS = new ArrayList<>();


    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemOS ios: ListItemOS ) {
            total += ios.getValorServico();
        }
        this.ValorTotal -= this.desconto;
        return total;
    }

    public double getTotal() {
        return ValorTotal;
    }

    public void setTotal(double total) {
        this.ValorTotal = total;
    }

    public Date getAgenda() {
        return agenda;
    }

    public void setAgenda(Date agenda) {
        this.agenda = agenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void add(ItemOS itemos)  {
        if(this.itemos == null){
            this.ListItemOS = new ArrayList<>();
        }
        this.ListItemOS.add(itemos);
    }

    public void remove (ItemOS itemOS) {
        if (this.ListItemOS != null) {
            this.ListItemOS.remove(itemOS);
        }
    }


}
