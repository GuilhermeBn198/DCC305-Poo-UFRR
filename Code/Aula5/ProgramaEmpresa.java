public class ProgramaEmpresa {

	public static void main(String[] args) {
        
		
		// Gerente é uma "extensão" de Funcionario
		// ou seja, Gerente herda da classe Funcionario
//		Gerente gerente01 = new Gerente();
		Gerente gerente01 = new Gerente("Fernando Araujo", "805.422.013-45", 5751.67, 123456, 5);
		
// Exemplos com os atributos da classe Funcionario como 
// package acess (padrão|sem modificador)		
//		// Os três primeiros atributos foram 
//		// herdados da classe Funcionario
//		gerente01.cpf = "805.422.013-45";
//		gerente01.nome = "Fernando Araujo";
//		gerente01.salario = 5751.67;
//		
//		// Os dois atributos são da classe Gerente
//		gerente01.senha = 123456;
//		gerente01.numeroDeFuncionariosGerenciados = 5;
		
		gerente01.autentica(1123456);
		gerente01.autentica(123456);
		
		gerente01.nome = "José Araújo";
		
		System.out.println("O novo gerente é:" + gerente01.nome);
		
	}

}