package Controle;
/*
 * Criar um programa que enquanto 
 * estiver recebendo n�meros positivos, 
 * imprime no console a soma dos n�meros inseridos, 
 * caso receba um n�mero negativo, encerre o programa. 
 * Tente utilizar a estrutura do while.
 */
import java.util.Scanner;

public class Exercicio7Aula42 {
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);	
		int soma=0;
		int numero = 0;
		do {
			numero = Integer.parseInt(s.nextLine());
			soma = numero+soma;	
			System.out.println("Resultao da soma dos n�meros inseridos "+ soma+"\n");
		}while (numero != -1);
	s.close();
	}
}
