public class Aula05 {
	public static void main(String[] args) {
		banco p1 = new banco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");

		banco p2 = new banco();
		p2.setNumConta(2222);
		p2.setDono("Cleusa");
		p2.abrirConta("CP");

		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);

		p1.sacar(150);
		p1.fecharConta();

		p1.estadoAtual();
		p2.estadoAtual();
	}

}
