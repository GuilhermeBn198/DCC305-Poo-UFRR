package Code.Aula4.Aula4ExCriandoEInstanciandoClasse;

public class Programa2 {
        public static void main(String[] args) {
            Conta minhaConta; //no código do programa foi criado um objeto do tipo Conta, para acessalo nesse código precisamos referencialo em uma variavel, no caso: minhaConta.
            minhaConta = new Conta();

            minhaConta.dono = "Duke"; //atraves da variavel minhaConta eh possivel acessar os dados do objeto Conta e até mesmo alterar suas caractreriscas como dono saldo etc.
            minhaConta.saldo = 1000.0;

            System.out.println("Saldo atual: " + minhaConta.saldo);
        }
}
