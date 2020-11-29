import java.util.*;
import javax.swing.*;

public class exerc005 {
	public static void main(String[] args) {
		String str = null;

		str = JOptionPane.showInputDialog("Informe seu nome: ");
		String nome = str;

		str = JOptionPane.showInputDialog("Informe sua idade: ");
		int idade = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Informe seu peso: ");
		float peso = Float.parseFloat(str);

		JOptionPane.showMessageDialog(null, "Dados da pessoa: \n" 
				+ "Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Peso: " + peso);
	}

}

