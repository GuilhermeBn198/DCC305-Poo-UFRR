import java.util.Random;

//criar run()
public class Passo implements Runnable {

    Random randGen = new Random(); // Instancia um obj usado pra gerar num entre 0 e 3
    String nome; // Atribbuto nome
    boolean isFree = false; // Atributo estáLivre
    int tempoPausado = 1000; // Tempo utilizado para sleep(?)
    Integer yRato = 1; // Linha atual
    Integer xRato = 1; // Colna atual
    Integer yRatoAnt = 1; // Linha anterior
    Integer xRatoAnt = 1; // Coluna anterior
    Integer decision = 0; // Utilizado pra decidir o caminho
    Integer timingS = 0;
    char iD;
    boolean isFreeFinally=false;

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

    // MÉTODO CONSTRUTOR, Inicia a thread ao ser criado um objeto do tipo
    // PAsso(rato)
    // AO SER CRIADO O OBJ, tu passa o nome, o tempo de pausa pra usar no sleep e o
    // labirinto em si

    public Passo(String nome, Integer timingS, char iD) {
        this.nome = nome;
        this.timingS = timingS;
        this.iD = iD;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        trySolve();
    }

    public void setInicio() {
        this.labirintoRato[1][1] = iD; // 'R' Representa o Rato
    }

    public void setPosition(Integer yR, Integer xR) {
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

    public void step() {
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
        }
    }

    public void trySolve() {
        setInicio();
        try {
            for (int i = 0; i < 1000; i++) {
                if (this.getIsFree()) {
                    isFreeFinally=true;
                    System.out.printf("Parabéns, o rato %s chegou no final do labirinto.", nome);
                    break;
                }
                System.out.printf("%d%n", i);
                this.step();
                this.printarLabirinto();
                Thread.sleep(10);
                synchronized(this){
                    while (isFreeFinally) {
                        
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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
    }// Fim printarLabirintow

    public boolean getIsFree() {
        return isFree;
    }
    synchronized void stop(){
        this.isFreeFinally=true;
        notify();
    }
}// Fim classe
