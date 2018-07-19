package Fundamentos;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio4Aula32 {
	public static void main(String[] args) {
		String s1  = JOptionPane.showInputDialog("Informe o numero 1");
		String s2 = JOptionPane.showInputDialog("Informe a numero 2");
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		JOptionPane.showInputDialog("O valor do numero 1 ao quadrado: ", Math.pow(num1,2));
		JOptionPane.showInputDialog("O valor do numero 2 ao cubo: ", Math.pow(num2,3));
	}
}
