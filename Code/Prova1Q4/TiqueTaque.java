public class TiqueTaque {
    boolean tiquer;
    synchronized void tique(boolean estaExecutando){ //verifica se tique tiver executando se estiver  executa tudo abaixo do if se não executa o if
        if (!estaExecutando) {
            tiquer = true;
            notify();
            return;
        }
        //System.out.println("tique ");
        tiquer = true;
        notify();
        try {
            while (tiquer) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized void tack(boolean estaExecutando){ //verifica se tack tiver executando se estiver  executa tudo abaixo do if se não executa o if
        if (!estaExecutando) {
            tiquer = false;
            notify();
            return;
        }
       //System.out.println("tack ");
        tiquer = false;
        notify();
        try {
            while (!tiquer) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //falta tentar a implementação do tock mas precisaria alterar a estrutura do parametro boolean de tique e tack, além do tipo da variavel tiquer para tentar ser feita.

}//Fm classe
