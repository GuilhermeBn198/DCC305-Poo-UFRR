import java.util.Random;
public class Passo extends Thread{  //Classe que extende Thread pra se comportar como uma
    Random randGen = new Random(19700621);  //Instancia um obj usado pra gerar num entre 0 e 3
    String nome;           //Atribbuto nome
    boolean isFree=false;   //Atributo estáLivre
    int tempoPausado=1000;       //Tempo utilizado para sleep(?)
    Integer yRato=1;      //Linha atual
    Integer xRato=1;      //Colna atual
    Integer yRatoAnt=1;   //Linha anterior
    Integer xRatoAnt=1;   //Coluna anterior
    Integer decision=0;   //Utilizado pra decidir o caminho
    

    char[][] labirintoRato = { 
        {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}, 
        {'*','@','*','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','*'},
        {'*','@','*','*','*','*','*','@','@','@','*','@','@','@','*','*','*','*','*','*','*','*','@','*','*','*','*','@','*','@','*','@','*'},
        {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','@','@','@','*','@','@','@','@','@','*','@','@','@','@','*','@','*','@','*'},
        {'*','@','*','*','*','*','*','*','*','@','*','@','*','*','*','*','@','*','@','*','*','*','*','*','*','*','*','*','*','@','@','@','*'},
        {'*','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','@','@','*','@','@','*','@','@','@','@','*','*','*','@','*'},
        {'*','@','*','*','*','*','*','@','*','*','*','@','*','@','*','*','@','*','*','@','@','@','*','*','@','*','*','@','@','*','*','@','*'},
        {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','*','@','@','@','@','*','@','@','*','@','@','@','*'},
        {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','S','*','*','*','*','*','*'} 
        };    //Labirinto como atributo
   

    //MÉTODO CONSTRUTOR, Inicia a thread ao ser criado um objeto do tipo PAsso(rato)
    //AO SER CRIADO O OBJ, tu passa o nome, o tempo de pausa pra usar no sleep e o labirinto em si
    public Passo(String nome){
        this.nome=nome;
    }  

public void setInicio(){
    this.labirintoRato[1][1]='R'; //'R' Representa o Rato
}

public void setPosition(Integer yR,Integer xR){ //2,1
    if (labirintoRato[yR][xR]=='@'){            //yA=1 xA=1 X=1 Y=1 
        
        yRatoAnt=yRato;     
        xRatoAnt=xRato;
        labirintoRato[yRatoAnt][xRatoAnt]='@';

        labirintoRato[yR][xR]='R';

        yRato=yR;
        xRato=xR;
    }
}

public void step(Integer decisao){
    decision= decisao;   //gera um numero aleatorio de 0 a 3 e associa a decision
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
    }
}
    // public void checkWall(){
    //     if(labirintoRato[][]=)
    // }
    //Printador de labirinto
    public void printarLabirinto(){
            for (int i=0;i<9;i++){
                for(int j=0;j<33;j++){
                    System.out.printf("%c",labirintoRato[i][j]);
                }
                System.out.println("");
            }
    }//Fim printarLabirintow
    
}//Fim classe
