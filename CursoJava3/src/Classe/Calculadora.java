package Classe;

public class Calculadora {
	double resultado;

//Dois parāmetros e um retorno	
	double somar(double a, double b){
		resultado = a+b;
		return resultado;
				
	}

//Um parāmetro e nenhum retorno	
	void acrescentar (double a){
		resultado+=a;
	}

//Nenhum parāmetro e um retorno
	double obterResultado(){
		return resultado;
	}

//Nem entrada nem retorno.	
	void limpar (){
		resultado=0;
	}
}
