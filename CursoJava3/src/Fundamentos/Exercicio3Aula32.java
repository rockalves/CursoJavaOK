package Fundamentos;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio3Aula32 {
	public static void main(String[] args) {
		String peso  = JOptionPane.showInputDialog("Informe o peso");
		String altura = JOptionPane.showInputDialog("Informe a altura");
		double numpeso = Double.parseDouble(peso);
		double numaltura = Double.parseDouble(altura);
		double imc =  numpeso/(Math.pow(numaltura,2));
		JOptionPane.showInputDialog("O seu IMC � ",imc); 
	}
}