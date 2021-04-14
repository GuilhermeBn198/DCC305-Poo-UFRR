
public class Funcionario {
    String nomeDoFuncionario; 
    String departamentoFuncionario;
    Double salarioFuncionario;
    Double aumentoSalario;
    String dataEntrada;
    String rg;
    
   public String getnomeDoFuncionario(){
       return  nomeDoFuncionario;
   }
   public String getdepartamentoFuncionario(){
       return departamentoFuncionario;
   }
   public Double getsalarioFuncionario(){
       return salarioFuncionario;
   }
   public String getdataEntrada(){
       return dataEntrada;
   }
   public String getrg(){
       return rg;
   }
   public Double getAumentoSalario(){
       return aumentoSalario;
   }
   
   public void setnomeDoFuncionario(String nomeDoFuncionario){
        this.nomeDoFuncionario = nomeDoFuncionario;
   }
   public void setdepartamentoFuncionario(String departamentoFuncionario){
        this.departamentoFuncionario = departamentoFuncionario;
    }
    public void setsalarioFuncionario(Double salarioFuncionario){
        this.salarioFuncionario = salarioFuncionario;
    }
    public void setdataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada; 
    }
    public void setRG(String rg){
        this.rg = rg;
    }
    public void setAumentoSalario(Double aumentoSalario){
        this.aumentoSalario = aumentoSalario;
    }

    public Double recebeAumento(){
        return  salarioFuncionario + aumentoSalario;
    }
    public Double calculaGanhoAnual(){
        return salarioFuncionario*12;
    }
    public void mostra(){
        System.out.print("\n\n Bem vindo Funcionario de RG "+getrg()+"\n sob a alcunha de "+getnomeDoFuncionario()+". \n"+" com tutela do departamento "+getdepartamentoFuncionario()+"\n com um salario de: "+getsalarioFuncionario()+ "!\n você entrou no escritório no dia "+getdataEntrada()+" e graças a isso voce adquiriu um aumento de: "+getAumentoSalario()+"R$\n totalizando um salario de "+  recebeAumento()+"R$.");
    }
}