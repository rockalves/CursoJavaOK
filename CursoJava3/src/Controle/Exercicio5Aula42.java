package Controle;

import javax.swing.JOptionPane;

/*
 * Criar um programa que receba um n�mero 
 * e diga se ele � um n�mero primo.
 * Refatorar este exerc�cio 04, utilizando a estrutura switch.
 */

public class Exercicio5Aula42 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero para verificar se � primo"));
		int ehPrimo = 1;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				ehPrimo = 0;
				break;
			}
		}

		switch (ehPrimo) {
		case 0:
			JOptionPane.showMessageDialog(null, "N�O � um n�mero primo! \nN�mero :" + num);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "� um n�mero primo! \nN�mero : " + num);
			break;
		}

		/*
		 * for(int i=2; i<num; i++){ if (num % i == 0){ ehPrimo = false; break;
		 * } } if (ehPrimo){ JOptionPane.showMessageDialog(null,
		 * "� um n�mero primo! \nN�mero : "+num); } else {
		 * JOptionPane.showMessageDialog(null,
		 * "N�O � um n�mero primo! \nN�mero :"+num); }
		 */

	}
}