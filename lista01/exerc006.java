import javax.swing.*; 

public class exerc006 {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;

		JOptionPane.showMessageDialog(null, "x = " + x);
		JOptionPane.showMessageDialog(null, "O valor de " + x + " + " + x + " é " + (x + x));
		JOptionPane.showMessageDialog(null, "x = ");
		JOptionPane.showMessageDialog(null, (x+y) + " = " + (y+x));
	}
}
