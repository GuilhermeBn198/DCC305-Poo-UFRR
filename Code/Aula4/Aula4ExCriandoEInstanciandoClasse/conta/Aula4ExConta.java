public class Aula4ExConta {
    //criação da classe Conta para ser usada em outro código
    int numero;
    String dono;
    double saldo;
    double limite;
    double quantidade;
    Cliente titular;// = new Cliente(); //quando chamarem new Conta, já haverá um new Cliente para ele.
    
/*    void saca(double quantidade) { //método com retorno VOID
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    */
    boolean saca(double valor) {
        if (this.saldo<valor) {
               return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Aula4ExConta destino, double valor){
        boolean retirou = this.saca(valor);
        if (retirou == false) { //não deu de sacar
            return false;
        } else { //deu de sacar
            destino.deposita(valor);
            return true;
        }
    }
}
