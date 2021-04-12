
public class TestaAlgunsMetodos {
   public static void main(String[] args) {
       //criando uma conta
       Aula4ExConta Aula4ExConta;
       Aula4ExConta = new Aula4ExConta();
       
       //alterando os valores da minhaConta
       Aula4ExConta.dono = "duke";
       Aula4ExConta.saldo = 20030;

       //saca 2000 reais
       Aula4ExConta.saca(2000);

       //deposita 5600 reais
       Aula4ExConta.deposita(5600);
       System.out.println("\n\n"+Aula4ExConta.saldo+" reais  \n\n");
   }
}
