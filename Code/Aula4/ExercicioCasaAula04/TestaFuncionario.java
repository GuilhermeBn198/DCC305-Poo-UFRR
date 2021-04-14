public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(); //resposta questao 1
        f1.setnomeDoFuncionario("guilherme");
        f1.setdepartamentoFuncionario("desenvolvimento de software");
        f1.setsalarioFuncionario(20000.0);
        f1.setRG("1234567");
        f1.setdataEntrada("08/08/2000");
        f1.setAumentoSalario(2000.0);

        Funcionario f2 = f1; //tentativa de fazer a questao 5 
        /*
        Funcionario f2 = new Funcionario();  /questao 3
        f2.setnomeDoFuncionario("guilhermer lucasss");
        f2.setdepartamentoFuncionario("desenvolvimento de software simm");
        f2.setsalarioFuncionario(333200.0);
        f2.setRG("123456117");
        f2.setdataEntrada("08/08/202200");
        f2.setAumentoSalario(202222300.0); */
        
        f1.mostra();
        f2.mostra();
        System.out.println("\n\n");
        
        if (f1 == f2) { //resposta questao 4
            System.out.println("os funcionários cadastrados são iguais!");
        } else {
            System.out.println("cadastro de funcionarios efetuado com sucesso!\n");
        } //resposta questão 5: quando se cria 2 objetos com new os espaços na memoria que guardam suas informações, mesmo que iguais, são diferentes, então no if dará false, porém se declaro uma variavel referenciando o primeiro funcionario e testo no if, sempre dará true pois as duas variaveis estão referenciando a 1 unico objeto em uma posição da memoria.
        

       
    }    
}
