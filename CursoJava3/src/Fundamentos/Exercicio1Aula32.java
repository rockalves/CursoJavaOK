package Fundamentos;
import javax.swing.JOptionPane;
public class Exercicio1Aula32 {
	public static void main(String[] args) {
	
		String celsius = JOptionPane.showInputDialog("Informe a temperatura em graus celsius");
		double numcelsius = Double.parseDouble(celsius);
		double fahrenheit = (numcelsius * 1.8)+32;
		JOptionPane.showInputDialog("A temperatura em Fahrenheit =", fahrenheit);
	}
}
