package Classe;

public class Funcionario {
	String nome;
	double salario;
	String funcao;

	Funcionario(String n,double sal,String f){
		nome=n;
		salario=sal;
		funcao=f;
	}
	
	Funcionario(){
		
	}
	void imprimir(){
		System.out.println("Nome: "+ nome+ "\n"+"Sal�rio: "+salario+"\n"+"Fun��o: "+funcao+"\n");	
	}
}
