public class DogActions extends Racadocao{

    String nomeDog;             //Nome do doguinho
    //STATUS BINARIOS
    boolean isAwake=true;       //Acordado
    boolean isTired=false;      //Cansado
    boolean lostOneFeet=false;  //Perdeu uma pata
    boolean isRecovering=false; //Recuperando-se
    boolean isSick=false;       //Doente

    //CONSTRUTOR
    protected DogActions(String name){
        this.nomeDog=name;
    }

    //Status não binarios
    Integer hunger =0; //Sem fome->Faminto
    Integer energy=10;  //Cansado->Descansado
    Integer bladder=0; //Bexiga vazia-> bexiga cheia
    Integer humour=10;  //Triste->Feliz

    void showStats(){
        //Mostrar status do doguinho
        System.out.println("Sobre o doguinho:\n");
        System.out.printf("Fome: %d%n",hunger);
        System.out.printf("Energia: %d%n",energy);
        System.out.printf("Bexiga: %d%n",bladder);
        System.out.printf("Humor: %d%n",humour);
        if(hunger > 7){
            System.out.println("Seu cachorro está com fome, voce deveria alimenta-lo.\n");
        }
        if(energy < 3){
            System.out.println("Seu cachorro está se sentindo cansado.\n");
        }
        if(bladder > 7){
            System.out.println("Seu cachorro logo logo irá querer fazer as suas necessidades.\n");
        }
        if(humour < 3){
            System.out.println("Seu cachorro está meio triste, você poderia animá-lo ou agita-lo.\n");
        }
    }
    void run(){
        System.out.println("Como o vento, seu cachorro corre velozmente!");
        this.energy -= 4;
        this.humour += 4;
        this.hunger += 3;
    }
    void takeAWalk(){
        System.out.println("Hoje é dia de passear :3");
        this.energy -= 1;
        this.humour += 2;
        this.hunger += 1;
    }
    void eat(){
            System.out.println("a refeicao esta servida!\n");
            this.hunger -= 6;
            this.humour += 1;
        }
    void sleep(){
        if (this.energy <= 10 && this.energy > 5) {
            this.energy = 10;
            System.out.println("O cachorro está 100% descansado e pronto para mais aventuras!\n");
        } else{
            this.energy =this.energy + 5;
            System.out.println("O cachorro recuperou parte de sua energia :)\n");
        }
        System.out.println("auau");
    }
    void accident(){
        System.out.println("Oh, nao! Seu dog sofreu um acidente\n");
        this.humour = 2;
        this.energy = 2;
        isRecovering = true;
        System.out.println("Para que seu cachorro se recupere, cuide dele e deixe a fome abaixo de 2 e a energia acima de 8");
    }





    //MÉTODOS DE CONTROLE
    void recuperar() {                 //Recuperar de acidentes
        if (energy < 8 && hunger  > 2)
            System.out.println("Seu cachorro ainda não tem os status suficientes para se recuperar.\n");
        else {
            System.out.println("Seu cachorro se recuperou do acidente e esta melhor :)\n");
            isRecovering = false;
        }
    }
    
    void addFood(Integer food){
        hunger -= food;
        if(hunger < 0)
            hunger = 0;
    }
    //hunger+
    //hunger-
    //energy+
    //energy-
    //bladder+
    //bladder-
    //humour+
    //humour-

    //void removerstatus()

    void poo(){
        System.out.println("O dog está realizando as suas necessidades, olhe para o lado.");
    }
    void pee(){
        System.out.println("Número 1 saindo. pssssssssssss");
    }

    //IF POSSIBLE, create INCREASE and DECREASE method to Avoid raising above 10 or lowering below 0
}