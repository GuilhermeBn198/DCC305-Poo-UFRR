public class TestaReferencias {
    public static void main(String[] args) {
        Aula4ExConta c1 = new Aula4ExConta();
        c1.deposita(100);

        Aula4ExConta c2 = new Aula4ExConta();
        c2.deposita(200);

        System.out.print("\n"+c1.saldo+"\n");
        System.out.print(c2.saldo);
    }
}
