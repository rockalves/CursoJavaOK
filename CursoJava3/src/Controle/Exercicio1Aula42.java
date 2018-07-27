package Controle;

import javax.swing.JOptionPane;

/*
 * 1. Criar um programa que receba 
 * um número e verifique se ele 
 * está entre 0 e 10 e é par;
 */

public class Exercicio1Aula42 {
	public static void main(String[] args) {
		String sNumero = JOptionPane.showInputDialog("Informe um número entre 0 e 10");
		int num = Integer.parseInt(sNumero);
		if (num >= 0 && num <= 10) {
			JOptionPane.showMessageDialog(null, "O número está entre 0 e 10");
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O número é par!");
			} else {
				JOptionPane.showMessageDialog(null, "O número é impar!");
			}
		}
		if (num > 10 || num < 0) {
			JOptionPane.showMessageDialog(null, "Número inválido");
		}
	}
}
