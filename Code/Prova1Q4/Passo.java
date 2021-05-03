import java.util.Random;

public class Passo implements Runnable {

    Random randGen = new Random(); // Instancia um obj usado pra gerar num entre 0 e 3
    String nome; // Atribbuto nome
    boolean isFree = false; // Atributo estáLivre
    // int tempoPausado = 1000; // Tempo utilizado para sleep(?)
    Integer yRato = 1; // Linha atual
    Integer xRato = 1; // Colna atual
    Integer yRatoAnt = 1; // Linha anterior
    Integer xRatoAnt = 1; // Coluna anterior
    Integer decision = 0; // Utilizado pra decidir o caminho
    char iD; //pega o id do rato a ser mostrado no labirinto
    boolean isFreeFinally = false;
    TiqueTaque tt;
    Thread t;
    final int num = 5;

    char[][] labirintoRato = {
            { '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*',
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
                    '*', '*', '*', '*', '*', 'S', '*', '*', '*', '*', '*', '*' } }; // Labirinto como atributo

    // MÉTODO CONSTRUTOR, Inicia a thread ao ser criado um objeto do tipo Passo com os parametros a serem passados como o nome do rato, a classe TiqueTaque e o iD do rato, alem de instanciar uma nova thread em t e dar .start()
    public Passo(String nome, TiqueTaque tt, char iD) {
        this.nome = nome;
        this.tt = tt;
        this.iD = iD;
        t = new Thread(this, nome);
        t.start();
    }

    public void run() {
        setInicio();
        switch (t.getName()) { //tentando aplicar switch pros ratos
            case "ROBERTO":
                for (int i = 0; i < num; i++) {
                    tt.tique(true);
                    if (this.getIsFree()) {
                        isFreeFinally=true;
                        System.out.printf("%nParabéns, o rato %s chegou no final do labirinto.%n", this.nome);
                        break;
                    }
                    System.out.printf("tentativa %d%n", (i+1));
                    this.step();
                    this.printarLabirinto();
                }
                tt.tique(false);
                break;
            case "CARLA":
                for (int i = 0; i < num; i++) {
                    tt.tack(true);
                    if (this.getIsFree()) {
                        isFreeFinally=true;
                        System.out.printf("%nParabéns, o rato %s chegou no final do labirinto.%n", this.nome);
                        break;
                    }
                    System.out.printf("tentativa %d%n", (i+1));
                    this.step();
                    this.printarLabirinto();
                }
                tt.tack(false);
                break; 
            // case "GISELDA":
            // for (int i = 0; i < num; i++) {
            //     tt.tack(true);
            //     if (this.getIsFree()) {
            //         isFreeFinally=true;
            //         System.out.printf("%nParabéns, o rato %s chegou no final do labirinto.%n", nome);
            //         break;
            //     }
            //     System.out.printf("tentativa %d%n", (i+1));
            //     this.step();
            //     this.printarLabirinto();
            // }
            // tt.tack(false);
            // break;
            default:
                break;
        }
    }

    public void setInicio() {
        this.labirintoRato[1][1] = iD; // iD Representa o Rato dentro do labirinto
    }

    public void setPosition(Integer yR, Integer xR) { // titulo autoexplicativo
        if (labirintoRato[yR][xR] == '@') {

            yRatoAnt = yRato;
            xRatoAnt = xRato;
            labirintoRato[yRatoAnt][xRatoAnt] = '@';

            labirintoRato[yR][xR] = iD;

            yRato = yR;
            xRato = xR;
        }
        if (labirintoRato[yR][xR] == 'S') {
            yRatoAnt = yRato;
            xRatoAnt = xRato;
            labirintoRato[yRatoAnt][xRatoAnt] = '@';

            labirintoRato[yR][xR] = 'W';

            yRato = yR;
            xRato = xR;
            isFree = true;
        }
    }

    public void step() { //titulo autoexplicativo
        decision = randGen.nextInt(4); // gera um numero aleatorio de 0 a 3 e associa a decision
        switch (decision) {
            case 0: // CIMA
                System.out.printf("%s tentou andar pra cima%n", nome);
                setPosition((yRato - 1), (xRato));
                break;
            case 1: // BAIXO
                System.out.printf("%s tentou andar pra baixo%n", nome);
                setPosition((yRato + 1), (xRato));
                break;
            case 2: // ESQUERDA
                System.out.printf("%s tentou andar pra esquerda%n", nome);
                setPosition((yRato), (xRato - 1));
                break;
            case 3: // DIREITA
                System.out.printf("%s tentou andar pra direita%n", nome);
                setPosition((yRato), (xRato + 1));
                break;
            default:
                break;
        }
    }

    // Printador de labirinto
    public void printarLabirinto() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 33; j++) {
                System.out.printf("%c", labirintoRato[i][j]);
            }
           System.out.println("");
        } 
        System.out.println("");
    }// Fim printarLabirintow

    public boolean getIsFree() { //retorna isFree
        return isFree;
    }

    synchronized void stop() {
        this.isFreeFinally = true;
        notify();
    }
}// Fim classe
