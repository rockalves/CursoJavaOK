package Controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double somaDasNotas = 0;
		double nota = 0;
		int indice = 0;
		
		while (indice<3){
			nota = s.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		s.close();
		System.out.printf("A media é %.2f", somaDasNotas/3);
	}
}
