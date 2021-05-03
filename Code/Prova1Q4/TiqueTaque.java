public class TiqueTaque {
    boolean tiquer;
    synchronized void tique(boolean estaExecutando){
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
    synchronized void tack(boolean estaExecutando){
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
}//Fm classe
