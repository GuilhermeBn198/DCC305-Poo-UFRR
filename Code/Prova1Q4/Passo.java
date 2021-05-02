public class Passo extends Thread { // Classe que extende Thread pra se comportar como uma
    String nome; // Atribbuto nome
    boolean isFree = false; // Atributo estáLivre
    char[][] labirintow; // Labirinto como atributo
    int tempoPausado;

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

    // A THREAD PROPRIAMENTE DITA
    public void run() {
        System.out.printf("O rato se chama %s%n", nome);
        printarLabirintow();
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }// Fim printarLabirintow

}// Fim classe
