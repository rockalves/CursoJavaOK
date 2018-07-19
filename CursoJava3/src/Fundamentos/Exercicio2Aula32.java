package Fundamentos;
import javax.swing.JOptionPane;
public class Exercicio2Aula32 {
	public static void main(String[] args) {
	
		String fahrenheit  = JOptionPane.showInputDialog("Informe a temperatura em graus fahrenheit ");
		double numcelsius = Double.parseDouble(fahrenheit);
		double celsius = (numcelsius - 32)/1.8;
		JOptionPane.showInputDialog("A temperatura em Fahrenheit =", celsius);
	}
}
