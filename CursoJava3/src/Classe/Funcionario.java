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
		System.out.println("Nome: "+ nome+ "\n"+"Salário: "+salario+"\n"+"Função: "+funcao+"\n");	
	}
}
