<<<<<<< Updated upstream
public class Passo extends Thread { // Classe que extende Thread pra se comportar como uma
    String nome; // Atribbuto nome
    boolean isFree = false; // Atributo estáLivre
    char[][] labirintow; // Labirinto como atributo
    int tempoPausado;
=======
import java.util.Random;
public class Passo extends Thread{  //Classe que extende Thread pra se comportar como uma
    Random randGen = new Random();  //Instancia um obj usado pra gerar num entre 0 e 3
    String nome;           //Atribbuto nome
    boolean isFree=false;   //Atributo estáLivre
    int tempoPausado=1000;       //Tempo utilizado para sleep(?)
    Integer yRato=1;      //Linha atual
    Integer xRato=1;      //Colna atual
    Integer yRatoAnt=1;   //Linha anterior
    Integer xRatoAnt=1;   //Coluna anterior
    Integer decision=0;   //Utilizado pra decidir o caminho
    
>>>>>>> Stashed changes

    /*
     * TALVEZ SEJA MELHOR CRIAR UM STATIC Q INCREMENTA NO CONSTRUTOR PRA ACRIAR X
     * INDICES DE VETOR DE CHAR
     */

    /*
     * GUILHERME, LEIA ISSO KKKKKKKKKK
     * 
     * O main cria os objetos dessa classe, q vai se comportar como thread por
     * herdar Thread, a classe Thread já é default do java.lang, ent n precisa
     * import Aq tem um construtor q já cria a thread pra cada obj criado no main
     * (os 3 ratos) O construtor seta o nome e recebe o mapa(checar) e seta
     * isFree=false pq o rato tá preso
     * 
     * O método run é a tarefa da thread em si, todo objeto =que estiver nessa
     * classe thread vai executar a thread dentro de run Resumindo: criando um rato
     * da classe Passo, ele faz o q tá em run
     * 
     * TEMOS QUE COPIAR A MATRIZ LABIRINTO PRA CADA OBJ TER A SUA SINCRONIZAR AS
     * THREADS PROS LABIRINTOS N SE SOBREPOREM IMPLEMENTAR OS PASSOS DE CADA RATO
     */

    // MÉTODO CONSTRUTOR, Inicia a thread ao ser criado um objeto do tipo
    // PAsso(rato)
    // AO SER CRIADO O OBJ, tu passa o nome, o tempo de pausa pra usar no sleep e o
    // labirinto em si
    public Passo(String nome, Integer tempoPausado, char[][] labirintow) {
        this.nome = nome;
        this.tempoPausado = tempoPausado;
        this.labirintow = labirintow;
        start(); // ESSE COMANDO JA STARTA A THREAD AO CRIAR O RATO (AXO Q VO MUDAR)
    }
<<<<<<< Updated upstream

    // A THREAD PROPRIAMENTE DITA
    public void run() {
        System.out.printf("O rato se chama %s%n", nome);
        printarLabirintow();
=======
    if (labirintoRato[yR][xR]=='S'){
        yRatoAnt=yRato;     
        xRatoAnt=xRato;
        labirintoRato[yRatoAnt][xRatoAnt]='@';

        labirintoRato[yR][xR]='W';

        yRato=yR;
        xRato=xR;
        isFree=true;
    }
}

public void step(Integer decisao){
    decision= randGen.nextInt(4);   //gera um numero aleatorio de 0 a 3 e associa a decision
    System.out.printf("%d",decision);
    switch(decision) {
        case 0:     //CIMA
                setPosition((yRato-1), (xRato));
                
                break;  
        case 1:     //BAIXO
                //checkWall();
                setPosition((yRato+1), (xRato));
                break;
        case 2:    //ESQUERDA
                //checkWall();
                setPosition((yRato), (xRato-1));
                break;
        case 3:    //DIREITA
                setPosition((yRato), (xRato+1));
>>>>>>> Stashed changes
    }

    // Printador de labirinto
    public void printarLabirintow() {
        try {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 33; j++) {
                    System.out.printf("%c", labirintow[i][j]);
                }
                System.out.println("");
                sleep(tempoPausado); // DA 2 segundos de pausa pra thread relaxar aí
            }
<<<<<<< Updated upstream
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }// Fim printarLabirintow

}// Fim classe
=======
    }//Fim printarLabirintow
    public boolean getIsFree(){
        return isFree;
    }
}//Fim classe
>>>>>>> Stashed changes
