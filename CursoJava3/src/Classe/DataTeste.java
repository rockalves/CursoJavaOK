package Classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data();
	
		nascimento.dia =28;
		nascimento.mes=10;
		nascimento.ano=1987;

		Data casamento = new Data(22,10,2010);
		
	
		System.out.println(nascimento.formatar()); 
		System.out.println(casamento.formatar());
		
//		System.out.printf("%d/%d/%d",nascimento.dia,nascimento.mes,nascimento.ano);
	}
}
