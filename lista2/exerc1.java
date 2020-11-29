import javax.swing.*;

public class exerc1 {
	public static void main(String[] args) {
		int c = 7;
		
		if(c < 7) //cod exercicio if(c < 7); JOptionPane.....
			//o codigo esta erro, pois o ponto e virgula esta no if, ou seja
			//o programa conclui o if, e depois imprime o JPotion separados
		JOptionPane.showMessageDialog(null, "c é menor que 7");

		if(c >= 7) //cod exercicio if(c => 7), esta da forma errado
			//o correto seria >=
		JOptionPane.showMessageDialog(null, "c é menor que 7");
	}

}
