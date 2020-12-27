public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
		Caneta c2 = new Caneta("BIC", "Azul", 0.5f);
		//c1.setModelo("Bic");
		//c1.setPonta(0.5f);
		//System.out.println("Tenho uma caneta " + c1.getModelo() + "de ponta " + c1.getPonta());
		c1.status();
		c2.status();
	}
}
