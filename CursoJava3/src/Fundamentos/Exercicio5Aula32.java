package Fundamentos;
import javax.swing.JOptionPane;

public class Exercicio5Aula32 {
	public static void main(String[] args) {
		String b  = JOptionPane.showInputDialog("Informe a base do tri�ngulo");
		String h = JOptionPane.showInputDialog("Informe a altura do tri�ngulo");
		double base = Double.parseDouble(b);
		double altura = Double.parseDouble(h);
		double area = (base*altura) / 2 ;
		JOptionPane.showInputDialog("O valor da �rea do tri�ngulo �: ", area);
	}
}
