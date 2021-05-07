public class Gerente {
    public class Gerente extends Funcionario {

        int senha;
        int numeroDeFuncionariosGerenciados;
    
    //	// Utilizando o comando super para invocar o construtor de Funcionario
    //	public Gerente(String nome, String cpf, double salario, int senha, int qtdDeFuncGer) {
    //		super(nome, cpf, salario); //invocar o construtor de Funcionario por auto-referenciação a Gerente	
    //		
    //		this.senha = senha;
    //		this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
    //				
    //	}
        
        // Sem o comando super, mas, utilizando os metodos de atualização de atributos (sets)
        // <OBS>: Usado quando os atributos estão privados (usa-se os metódos ou construtor de Funcionario) 
    //	public Gerente(String nome, String cpf, double salario, int senha, int qtdDeFuncGer) {
    //		super ();
    //		
    //		// Usando os métodos da classe herdada (Funcionario) para 
    //		// atualizar os atributos do mesmo (Funcionario)
    //		this.setNome(nome);
    //		this.setCpf(cpf);
    //		this.setSalario(salario);
    //		
    //		this.senha = senha;
    //		this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
    //				
    //	}
        
        // Sem o comando super, mas, utilizando os metodos de atualização de atributos (sets)
            // <OBS>: Usado quando os atributos estão protected (pode se acessar diretamente os atributos da
            //        super classe)
            // <DESVANTAGEM>: Quando usa-se o protected permite-se que todas as classes do pacote 
            //                possam acessar os atributos da classe herdada (visualizar)
            public Gerente(String nome, String cpf, double salario, int senha, int qtdDeFuncGer) {
                // TODO Auto-generated constructor stub
                super ();
                
                // Permite o acesso aos atributos da classe herdada (Funcionario) para 
                // sua atualizar ou acesso aos dados
                this.nome = nome;
                this.cpf = cpf;
                this.salario = salario;			
                
                this.senha = senha;
                this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
                        
            }
        
        public Gerente(int senha, int qtdDeFuncGer) {
            // TODO Auto-generated constructor stub
            super ();		
            
            this.senha = senha;
            this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
                    
        }
        
        public Gerente(String nome, String cpf, int senha, int qtdDeFuncGer) {
            // TODO Auto-generated constructor stub
            super(nome, cpf);		
            
            this.senha = senha;
            this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
                    
        }
        
    
        public boolean autentica(int senha) {
    
            if (this.senha == senha) {
                System.out.println("Acesso Permitido!");
                return true;
            } else {
                System.out.println("Acesso Negado!");
                return false;
            }
        }
    }
}
