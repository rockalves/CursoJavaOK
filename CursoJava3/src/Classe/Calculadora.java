package Classe;

public class Calculadora {
	double resultado;

//Dois par�metros e um retorno	
	double somar(double a, double b){
		resultado = a+b;
		return resultado;
				
	}

//Um par�metro e nenhum retorno	
	void acrescentar (double a){
		resultado+=a;
	}

//Nenhum par�metro e um retorno
	double obterResultado(){
		return resultado;
	}

//Nem entrada nem retorno.	
	void limpar (){
		resultado=0;
	}
}
