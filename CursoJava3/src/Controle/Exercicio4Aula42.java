package Controle;

import javax.swing.JOptionPane;

/*
 * Criar um programa que receba um n�mero 
 * e diga se ele � um n�mero primo.
 */


public class Exercicio4Aula42 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero para verificar se � primo"));
		boolean ehPrimo = true;
		for(int i=2; i<num; i++){
			if (num % i == 0){
				ehPrimo = false;
				break;
			}
		}
		if (ehPrimo){
			JOptionPane.showMessageDialog(null, "� um n�mero primo! \nN�mero : "+num);
		} else {
			JOptionPane.showMessageDialog(null, "N�O � um n�mero primo! \nN�mero :"+num);
		}

	}
}
