public class LabirintoMain {
    static char[][] labirintor = {
            { '*', 'E', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*',
                    '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
            { '*', '@', '*', '@', '@', '@', '@', '@', '*', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@',
                    '*', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '*' },
            { '*', '@', '*', '*', '*', '*', '*', '@', '@', '@', '*', '@', '@', '@', '*', '*', '*', '*', '*', '*', '*',
                    '*', '@', '*', '*', '*', '*', '@', '*', '@', '*', '@', '*' },
            { '*', '@', '@', '@', '@', '@', '@', '@', '*', '@', '@', '@', '*', '@', '@', '@', '@', '*', '@', '@', '@',
                    '@', '@', '*', '@', '@', '@', '@', '*', '@', '*', '@', '*' },
            { '*', '@', '*', '*', '*', '*', '*', '*', '*', '@', '*', '@', '*', '*', '*', '*', '@', '*', '@', '*', '*',
                    '*', '*', '*', '*', '*', '*', '*', '*', '@', '@', '@', '*' },
            { '*', '@', '@', '@', '@', '@', '*', '@', '@', '@', '*', '@', '*', '@', '@', '@', '@', '@', '@', '@', '*',
                    '@', '@', '*', '@', '@', '@', '@', '*', '*', '*', '@', '*' },
            { '*', '@', '*', '*', '*', '*', '*', '@', '*', '*', '*', '@', '*', '@', '*', '*', '@', '*', '*', '@', '@',
                    '@', '*', '*', '@', '*', '*', '@', '@', '*', '*', '@', '*' },
            { '*', '@', '@', '@', '@', '@', '@', '@', '*', '@', '@', '@', '*', '@', '*', '@', '@', '@', '@', '@', '*',
                    '@', '@', '@', '@', '*', '@', '@', '*', '@', '@', '@', '*' },
            { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*',
                    '*', '*', '*', '*', '*', 'S', '*', '*', '*', '*', '*', '*' } }; // matriz de caracteres com o modelo
                                                                                    // do labirinto

    // MÉTODO MAIN
    public static void main(String[] args) {
        System.out.println(
                "os ratos serão colocados dentro do primeiro @ a esquerda do labirinto, 'E' representa por eles entrarão e será fechado logo após suas entradas!\n");
        System.out.println();
        System.out.println("labirinto original:");
        mostrarLabirinto(); // Exibe o labirinto

        TiqueTaque tt = new TiqueTaque();
        Passo tique = new Passo("ROBERTO", tt, 'R'); // Cria rato 1
        Passo taque = new Passo("CARLA", tt, 'C'); // Cria rato 2
        // Passo tock = new Passo("GISELDA", tt, 'G'); //Cria rato 3

        try {
            tique.t.join();
            taque.t.join();
            // tock.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // INFORMA OS RATOS QUE SAIRAM
        if (tique.getIsFree())
            System.out.printf("%n%s chegou ao final.%n", tique.nome);
        if (taque.getIsFree())
            System.out.printf("%n%s chegou ao final!%n", taque.nome);
        // if(tock.getIsFree())
        // System.out.printf("%s chegou ao final!!", tock.nome);

    }// Fim main

    // Printar labirinto original
    public static void mostrarLabirinto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 33; j++) {
                System.out.printf("%c", labirintor[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

    }// Fim printarLabirinto
}
