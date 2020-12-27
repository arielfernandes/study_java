public class Lutador {
	//Atributos
	private String nome, nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria, derrota, empates;

	//Métodos Especiais
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitoria(vi);
		this.setDerrota(de);
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return this.categoria;
	}
	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		}else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		}else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	public int getVitoria() {
		return this.vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getDerrota() {
		return this.derrota;
	}
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	public int getEmpates() {
		return this.empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	//Métodos
	public void apresentar() {
		System.out.println("-----------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando " + this.getPeso() + "kg");
		System.out.println("Ganhou: " + this.getVitoria());
		System.out.println("Pedeu: " + this.getDerrota());
		System.out.println("Empatou: " + this.getEmpates());
	}
	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso " + this.getCategoria());
		System.out.println(getVitoria() + " vitórtias");
		System.out.println(getDerrota() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}
	public void ganharLuta() {
		this.setVitoria(this.getVitoria() + 1);
	}
	public void perderLuta() {
		this.setDerrota(this.getDerrota() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
