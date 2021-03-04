import java.util.*;
public class Ticket {
	private int tipoPassageiro;
	boolean[] assentos = new  boolean[10];

	public int getTipoPassageiro() {
		return tipoPassageiro;
	}
	public void setTipoPassageiro(int t) {
		this.tipoPassageiro = t;
	}

	public void lerPassageiro() {
		int i = 0;
		if (this.tipoPassageiro == 1) {
			System.out.println("Fumante");
		}else {
			System.out.println("Não fumante");
		}
	}

	public void menuPrincipal() {
		System.out.println("1. Fumante \n2. Não Fumante\n 0. Sair");
		System.out.print(">> ");
	}

}
