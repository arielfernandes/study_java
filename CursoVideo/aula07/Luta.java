import java.util.Random;
public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;

	//Métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovado(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}else{
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if(this.getAprovado()) {
			System.out.println("### Desafiado ###");
			this.getDesafiado().apresentar();
			System.out.println("### Desafiante ###");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
				case 0:
					System.out.println("Empatou!");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1:
					System.out.println("Vitórioa do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println("Vitória do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		}else {
			System.out.println("Luta não pode acontecer");
		}
	}
	//Métodos Especiais
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public boolean getAprovado() {
		return this.aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
}
