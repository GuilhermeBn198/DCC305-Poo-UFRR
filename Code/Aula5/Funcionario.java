public class Funcionario {
    public class Funcionario {

        //	String nome;
        //	String cpf;
        //	double salario;
                
        //	private String nome;
        //	private String cpf;
        //	private double salario;
            
            protected String nome;
            protected String cpf;
            protected double salario;
            
            
            public Funcionario(String nome, String cpf, double salario) {
                // TODO Auto-generated constructor stub
                this.nome = nome;
                this.cpf = cpf;
                this.salario = salario;
            }
            
            public Funcionario(String nome, String cpf) {
                // TODO Auto-generated constructor stub
                this.nome = nome;
                this.cpf = cpf;
            }
            
            public Funcionario() {
                // TODO Auto-generated constructor stub
            }
            
            public String getNome() {
                return nome;
            }
        
            public void setNome(String nome) {
                this.nome = nome;
            }
        
            public String getCpf() {
                return cpf;
            }
        
            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
        
            public double getSalario() {
                return salario;
            }
        
            public void setSalario(double salario) {
                this.salario = salario;
            }
            
        }
}
