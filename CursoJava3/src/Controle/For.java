package Controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	double somaDasNotas =0;
	double nota =0;
	
	
	for (int indice = 0;indice <3;indice++){
		nota = s.nextDouble();
		somaDasNotas += nota;
		
	}
	s.close();
	System.out.printf("A média é %.2f",somaDasNotas/3);
	}
}
