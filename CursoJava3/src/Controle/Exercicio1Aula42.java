package Controle;

import javax.swing.JOptionPane;

/*
 * 1. Criar um programa que receba 
 * um n�mero e verifique se ele 
 * est� entre 0 e 10 e � par;
 */

public class Exercicio1Aula42 {
	public static void main(String[] args) {
		String sNumero = JOptionPane.showInputDialog("Informe um n�mero entre 0 e 10");
		int num = Integer.parseInt(sNumero);
		if (num >= 0 && num <= 10) {
			JOptionPane.showMessageDialog(null, "O n�mero est� entre 0 e 10");
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O n�mero � par!");
			} else {
				JOptionPane.showMessageDialog(null, "O n�mero � impar!");
			}
		}
		if (num > 10 || num < 0) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido");
		}
	}
}
