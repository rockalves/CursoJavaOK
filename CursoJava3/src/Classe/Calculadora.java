package Classe;

public class Calculadora {
	double resultado;

//Dois parâmetros e um retorno	
	double somar(double a, double b){
		resultado = a+b;
		return resultado;
				
	}

//Um parâmetro e nenhum retorno	
	void acrescentar (double a){
		resultado+=a;
	}

//Nenhum parâmetro e um retorno
	double obterResultado(){
		return resultado;
	}

//Nem entrada nem retorno.	
	void limpar (){
		resultado=0;
	}
}
