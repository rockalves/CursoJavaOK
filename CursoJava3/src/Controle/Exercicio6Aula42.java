package Controle;

import javax.swing.JOptionPane;

/*
 * Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100. 
 * Armazene um n�mero aleat�rio em uma vari�vel. 
 * O Jogador tem 10 tentativas para adivinhar o n�mero gerado. 
 * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
 * e imprima se o n�mero inserido � maior ou menor do que o n�mero armazenado.
 * 
 */

public class Exercicio6Aula42 {
	public static void main(String[] args) {
		final int tamanho = 11;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero a ser adivinhado"));
		boolean achou = false;
		for (int i = 1; i <= tamanho; i++) {
			int tentativa = 0;
			tentativa = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a tentativa. \nRestam " + (tamanho - i) + " tentativas"));
			if (tentativa == num) {
				achou = true;
				break;
			} else if (tentativa < num) {
				JOptionPane.showMessageDialog(null, "O n�mero informado � menor que o n�mero a ser adivinhado");
			} else if (tentativa > num) {
				JOptionPane.showMessageDialog(null, "O n�mero informado � maior que o n�mero a ser adivinhado");
			}
		}
		if (achou) {
			JOptionPane.showMessageDialog(null, "Voc� acertou :" + num);
		} else {
			JOptionPane.showMessageDialog(null, "Suas tentativas se esgotaram, o n�mero correto �: " + num);
		}
	}
}
