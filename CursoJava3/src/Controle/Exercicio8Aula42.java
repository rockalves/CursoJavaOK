package Controle;

import javax.swing.JOptionPane;

/*
 * Criar um programa que receba uma palavra 
 * e imprime no console letra por letra.
 * 
 */
public class Exercicio8Aula42 {
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Informe a palavra");
		int tamanho = palavra.length();
		for (int i = 0;i<tamanho;i++){
			System.out.println(palavra.substring(i,i+1));
		}
	}
}
