public class LabirintoMain {
    static char[][] labirintor = { 
        {'*','E','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}, 
        {'*','@','*','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','@','@','*','@','@','@','@','@','@','@','@','@','@','*'},
        {'*','@','*','*','*','*','*','@','@','@','*','@','@','@','*','*','*','*','*','*','*','*','@','*','*','*','*','@','*','@','*','@','*'},
        {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','@','@','@','*','@','@','@','@','@','*','@','@','@','@','*','@','*','@','*'},
        {'*','@','*','*','*','*','*','*','*','@','*','@','*','*','*','*','@','*','@','*','*','*','*','*','*','*','*','*','*','@','@','@','*'},
        {'*','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','@','@','*','@','@','*','@','@','@','@','*','*','*','@','*'},
        {'*','@','*','*','*','*','*','@','*','*','*','@','*','@','*','*','@','*','*','@','@','@','*','*','@','*','*','@','@','*','*','@','*'},
        {'*','@','@','@','@','@','@','@','*','@','@','@','*','@','*','@','@','@','@','@','*','@','@','@','@','*','@','@','*','@','@','@','*'},
        {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','*','S','*','*','*','*','*','*'} 
        };
    
        //MÉTODO MAIN
        public static void main(String[]args){
            System.out.println();
            System.out.println("labirinto original:");
            mostrarLabirinto();                             //Exibe o labirinto 
            TiqueTaque tt = new TiqueTaque();
            Passo tique = new Passo("tique", tt, 'R');           //Cria rato 1
            Passo taque = new Passo("taque", tt, 'C');           //rato 2
            //Passo rat3 = new Passo("Grisalda", 700, 'c');           //rato 3

            try {
                tique.t.join();
                taque.t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            //INFORMA OS RATOS QUE SAIRAM
            if(tique.getIsFree())
                System.out.printf("%n%s chegou ao final.%n", tique.nome);
            // if(taque.getIsFree())
            //     System.out.printf("%n%s chegou ao final!%n", taque.nome);
            // if(rat1.getIsFree())
            //     System.out.printf("%s chegou ao final!!", rat3.nome);
            
        }//Fim main
        
    //Printar labirinto original
    public static void mostrarLabirinto(){
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 33; j++){
                System.out.printf("%c",labirintor[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

    }//Fim printarLabirinto
}
