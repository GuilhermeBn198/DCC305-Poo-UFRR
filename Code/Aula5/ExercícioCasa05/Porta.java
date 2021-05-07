public class Porta {
    boolean aberta;

    Porta(String s) {
        if (s.equals("aberta"))
            aberta = true;
        else
            aberta = false;
    }

    boolean estaAberta() {
        if (this.aberta == true) {
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta fechada");
        }
        return false;
    }

}