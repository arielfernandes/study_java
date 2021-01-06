public class Aula12{
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();

		//m.setPeso(35.3f);
		//m.setCorPelo("Marrom");
		//m.alimentar();
		//m.locomover();
		//m.emitirSom();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldenFish g = new GoldenFish();
		Arara e = new Arara();

		c.locomover();
		k.locomover();
		k.emitirSom();
		c.emitirSom();
	}
}
