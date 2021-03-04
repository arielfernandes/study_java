import java.util.*;
public class Array implements Interface {
	private int valor;

	ArrayList<Integer> myNumbers = new ArrayList<Integer>();

	public int getValor() {
		return valor;
	}
	public void setValor(int n) {
		this.valor = n;
	}
	@Override
	public void gerarValores(){
		Random gerador = new Random();

		for(int i = 1; i <= getValor(); i++) {
			this.myNumbers.add(gerador.nextInt(10));
		}
	}
	@Override
	public void lerValores() {
		for(int i : this.myNumbers) {
			System.out.print(i + " ");
		}
	}
	@Override
	public void maiorElemento() {
		int maior = this.myNumbers.get(0);
		for (int valor : myNumbers) {
			if(valor > maior) {
				maior = valor;
			}
		}
		System.out.println("Maior = " + maior);
	}
	@Override
	public void menorElemento() {
		int menor = this.myNumbers.get(0);
		for (int valor : myNumbers) {
			if(valor < menor) {
				menor = valor;
			}
		}
		System.out.println("Menor = " + menor);
	}
	@Override
	public void soma() {
		int s = 0;
		for(int i = 0; i < getValor(); i++) {
			s += myNumbers.get(i);
		}
		System.out.println("Soma = " + s);
	}
	@Override
	public void media() {
		float m, s = 0;
		for(int i = 0; i < getValor(); i++) {
			s += myNumbers.get(i);
		}
		m = s/getValor();
		System.out.println("\nMedia = " + m);
		System.out.println();
	}

}
