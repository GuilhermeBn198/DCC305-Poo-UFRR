public class Programa {
    public static void main(String[] args) {
    /*
        Aula4ExConta minhaConta; //foi REFERENCIADO A CLASSE Aula4ExConta, para acessa-lo nesse código precisamos referencia-lo em uma variavel, no caso: minhaConta e minhaConta2.
        minhaConta = new Aula4ExConta();

        minhaConta.dono = "Duke"; //atraves da variavel minhaConta eh possivel acessar os dados do objeto Aula4ExConta e até mesmo alterar suas caractreriscas como dono saldo etc.
        minhaConta.saldo = 2001.0;

        Aula4ExConta minhaConta2;
        minhaConta2 = new Aula4ExConta(); //cria-se uma segunda conta
        minhaConta2.dono = "guilherme";
        minhaConta2.saldo = 2000;
        boolean consegui =  minhaConta.saca(2000);
        if (consegui) {
            System.out.println("Consegui Sacar");
        } else {
            System.out.println("não consegui sacar");
        }
        
        if  ( (minhaConta.saca ( 2000 ) ) ) { //uso sem variavel temporaraia
            System.out.println("\n\nConsegui Sacar");
        } else {
            System.out.println("\n\nNão consegui sacar");
        }

        System.out.println("Saldo atual: " + minhaConta.saldo + " Reais\n\n");

        */

        Aula4ExConta minhaConta = new Aula4ExConta();
        Cliente c = new Cliente();
        minhaConta.titular = c;

    }

}