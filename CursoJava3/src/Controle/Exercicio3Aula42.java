package Controle;

import javax.swing.JOptionPane;
/*
 * Criar um programa que receba duas notas parciais, calcular a m�dia final.
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recupera��o", 
 * caso contr�rio imprime no console "Reprovado".
 * 
 */
public class Exercicio3Aula42 {
	public static void main(String[] args) {
		final int qtdNotas = 2;
		// for (int i = 0; i <= qtdNotas; i++) {
		String sNota1 = JOptionPane.showInputDialog("Informe a primeira nota");
		String sNota2 = JOptionPane.showInputDialog("Informe a segunda nota");
		double nota1 = Double.parseDouble(sNota1);
		double nota2 = Double.parseDouble(sNota2);
		double media = (nota1 + nota2) / qtdNotas;
		
		if (media >=7.0){
			JOptionPane.showMessageDialog(null, "Aprovado! \nM�dia: "+media);
		} else if (media<7.0 && media > 4.0){
			JOptionPane.showMessageDialog(null, "Recupera��o!\nM�dia: "+media);
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado!\nM�dia: "+media);
		}
		// }
	}
}
