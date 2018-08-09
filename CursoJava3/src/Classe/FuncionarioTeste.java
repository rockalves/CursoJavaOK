package Classe;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Asd", 4.600, "Analista de Sistemas");
		
		Funcionario func2 = new Funcionario();
		func2.nome = "André Alves";
		func2.salario=5622;
		func2.funcao="Analista Programador";
		func1.imprimir();
		func2.imprimir();
	}

}
