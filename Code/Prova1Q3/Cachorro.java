import java.util.Scanner;
import java.util.InputMismatchException;

public class Cachorro { 

    public static void main(String[] args) {
        int checkT= 0;
        String nome = " ";       //Nome do Dog
        String respostadono;     //Guarda "s" o"n" pra definir se o dono quer cuidar do dog
        String dono;             //Guarda "s" o"n" pra definir se o Dog tem dono
        String guardadono;       //Guarda "s" ou "n" definitivamente para saber se o Dog tem dono ou não
        String saude;            //Nº feridas do Dog
        String terminaAplicacao; //String para finalizar a aplicação

        String trueFocinho;
        String truePelagem;
        String trueCorDoPelo;
        String trueComportamento;

        Scanner input = new Scanner(System.in);
        Racadocao raca = new Racadocao();
       
        //Limpa a tela (kind of)
        limpatela();

        //Nome do Dog
        System.out.printf("Ola, bem vindo ao sistema de cadastro animal.%n");
        System.out.printf("O dog tem nome? %n");
        if (!nome.equals(" ")) {
            System.out.printf("%s... que nome bonito :)%n", nome);
        } else {
            System.out.printf("Parece que nao...%n Entao vamos nomear o doguinho!%n ");
            nome = input.nextLine();
        }
        pulaL();             //100% WORKING

        //Pega Dono
        guardadono = "n";
        System.out.printf("Entao, %s, voce tem um dono?('s' para SIM, 'n' para NAO) %n", nome);
        dono=input.nextLine();
        do {
            switch (dono) {
                case "s":
                    System.out.println("Muito boom, otimo");
                    pulaL();
                    break;

                case "n":
                    System.out.printf("Parece que %s nao tem dono... %nnesse caso, gostarias de ser o dono do %s?('s' para SIM, 'n' para NÃO)%n", nome, nome);
                     respostadono = input.nextLine();
                     do {
                         switch (respostadono) { 
                             case "s":
                                 System.out.println("OHH QUE COISA BOA");
                                 dono = "s";
                                 guardadono = "s";
                                 checkT=1;
                                 break;
                             case "n":
                                System.out.println("tudo bem então.......");
                                dono = "s";
                                guardadono = "n";
                                checkT=1;
                                break;

                             default:
                               tratexcept();//Erro do do while interno
                                respostadono = input.nextLine();
                                break;
                                }
                     } while (checkT==0);
                    break;

                default:
                    tratexcept(); //Erro no do while externo
                    dono = input.nextLine();
                    continue;
            } while (!dono.equals("s") && !dono.equals("n"));
} while(!dono.equals("s")  && !dono.equals("n"));
        
        //pega ferimento
        System.out.printf("%s Tem algum ferimento?%n", nome);
        saude = input.nextLine();
        pulaL();

        System.out.println("Agora veremos qual e a raça do doguinho!");
        pulaL();
        pulaL();
        //dá infos sobre as raças!
        System.out.println("Uma raça de cão tem muitas caracteristicas distintas, entre elas o tamanho e cor do pelo, o tipo do crânio, o tipo do latido, alguns até mesmo uivam!");
        System.out.println("Temos em nosso banco um total de 5 raças de cachorros: Pastor Alemao, Pitbull, Husky Siberiano, Pinscher e Dachshund");
        pulaL();
        pulaL();
        System.out.println("Pastor Alemão: uma raça de porte grande, com personalidade leal, TEMPERAMENTO equilibrado, dócil e obediente. podendo ter PELAGEM curta ou longa. possui um FOCINHO do tipo mesocefálico, sua COR DE PELOS VARIA entre preto com marcas marrom e marrom com marcas amarelas, pode UIVAR e seu LATIDO tende a ser grosso");
        divisorAsterisco();
        System.out.println("Pitbull: Ao contrario da crença popular de que são animais de TEMPERAMENTO agressivo e rude, é na verdade uma raça muito generosa, legal e companheira,  de PELAGEM curta, possui um FOCINHO do tipo mesocefálico e a COR DE SEUS PELOS é bastante variada,  LATEM grosso");
        divisorAsterisco();
        System.out.println("Husky Siberiano: SÃO bastante brincalhões e acolhedores, com PELAGEM longa, possui um FOCINHO do tipo mesocefálico e a COR DE SEUS PELOS varia desde o preto até o branco puro,  LATE grosso e pode UIVAR.");
        divisorAsterisco();
        System.out.println("Pinscher: uma raça de porte pequeno, podendo sere acomodado em pequenos apartamentos, tem um TEMPERAMENTO bastante excêntrico, protetor e corajoso. Sua PELAGEM é curta e tem um FOCINHO do tipo braquiocefálico(Curto), a COR DOS PELOS pode ser preto com marcas marrom ou só vermelho cervo ou vermelho castanho. LATE fino(muuuuito).");
        divisorAsterisco();
        System.out.println("Dachshund: TEMPERAMENTO dócil e amigavel, FOCINHO dolicocefálico, sua PELAGEM pode ser longa ou curta. A COR DOS PELOS pode ser bastante variada e latem fino. ");
        pulaL();
        pulaL();
        System.out.println("Com base nessas informaçoes, poderia nos descrever a raça do seu cao?.");
        pulaL();
        pulaL();

        //pega focinho
        System.out.println("Descreva o focinho do cao, digitando o codigo relativo ao tipo\n1 para braquiocefalico\n2 para mesocefalico\n3 para dolicocefAlico:");
        raca.setFocinho(input.nextInt());
        while (!raca.getFocinho().equals(1) && !raca.getFocinho().equals(2) && !raca.getFocinho().equals(3)) {
            try {
                tratexcept();
                raca.setFocinho(input.nextInt());
               raca.getFocinho();
            } catch (InputMismatchException e) {
                tratexcept();
                raca.setFocinho(input.nextInt());
                raca.getFocinho();
            }
        }
        input.nextLine();  // consome resto da linha

        //pega o tipo de pelagem
        pulaL();
        System.out.println("Descreva agora qual o tipo de pelagem do cão, digitando o codigo relativo ao tipo\n1 para curto\n2 para longo:");
        raca.setPelagem(input.nextInt());
        while (raca.getPelagem().equals(1) && raca.getPelagem().equals(2)) {
            try {
                tratexcept();
                raca.setPelagem(input.nextInt());
            } catch (Exception e) {
                tratexcept();
                raca.setPelagem(input.nextInt());
            }
        }
        input.nextLine();  // Consome resto da linha

        //pega o comportamento
        pulaL();
        System.out.printf("Descreva o comportamento do animal. variando entre: %n'equilibrado, dócil e obediente' %n'generosa, legal e companheira,' %n'brincalhão e acolhedor' %n'excêntrico, protetor e corajoso' %n'dócil e amigavel' %nrespectivamente seus códigos são 1, 2, 3, 4 e 5: ");
         raca.setComportamento(input.nextInt());
        while (!raca.getComportamento().equals(1) && !raca.getComportamento().equals(2) && !raca.getComportamento().equals(3) && !raca.getComportamento().equals(4) && !raca.getComportamento().equals(5)) {
            try {
                raca.setComportamento(input.nextInt());
            } catch (Exception e) {
                tratexcept();
                raca.setComportamento(input.nextInt());
            }
        }
        input.nextLine(); //consome o resto da linha anterior

        //Pega a cor dos pelos
        pulaL();
        System.out.printf("Descreva agora qual a cor dos pelos do cão: %n1 para preto com marcas marrom%n2 para marrom com marcas amarelas%n3 para variada%n4 para preto%n5 para vermelho%n6 para branco puro%n7 para vermelho cervo%n8 para vermelho castanho %n");
        raca.setCorDoPelo(input.nextInt());
        while (!raca.getCorDoPelo().equals(1) && !raca.getCorDoPelo().equals(2) && !raca.getCorDoPelo().equals(3) && !raca.getCorDoPelo().equals(4) && !raca.getCorDoPelo().equals(5) && !raca.getCorDoPelo().equals(6) && !raca.getCorDoPelo().equals(7) && !raca.getCorDoPelo().equals(8)) {
            switch (raca.getCorDoPelo()) {
                case 1:
                    raca.setCorDoPelo(1);
                    break;
                case 2:
                    raca.setCorDoPelo(2);
                    break;
        
                case 3:
                    raca.setCorDoPelo(3);
                    break;
        
                case 4:
                    raca.setCorDoPelo(4);
                    break;
        
                case 5:
                    raca.setCorDoPelo(5);
                    break;
        
                case 6:
                    raca.setCorDoPelo(6);
                    break;
            
                case 7:
                    raca.setCorDoPelo(7);
                    break;
            
                case 8:
                    raca.setCorDoPelo(8);
                    break;
               default:
                    tratexcept();
                    raca.setCorDoPelo(input.nextInt());
                    break;
            }
        }

        //pega o latido
        pulaL();
        System.out.println("descreva o latido do cão(entre grosso ou fino):");
        raca.setLatido(input.nextLine());
        while (!raca.getLatido().equals("grosso")  && !raca.getLatido().equals("fino")){
            try {
                raca.setLatido(input.nextLine());
            } catch (Exception e) {
                tratexcept();
                raca.setLatido(input.nextLine());
            }
        }

        //pega uivo
        pulaL();
         System.out.println("fale se o cão pode uivar:('s' para sim e 'n' para não)");
        raca.setUivar(input.nextLine());
        while (!raca.getUivar().equals("s") && !raca.getUivar().equals("n")) {
            try {
                raca.setUivar(input.nextLine());
            } catch (Exception e) {
                tratexcept();
                raca.setUivar(input.nextLine());
            }
        }
        limpatela();
        //lógica p determinar a raça do cão //FEITO
        if(raca.getFocinho().equals(2) && (raca.getPelagem().equals(1) || raca.getPelagem().equals(2))  && (raca.getCorDoPelo().equals(1) || raca.getCorDoPelo().equals(2)) &&  (raca.getComportamento().equals(1) || raca.getComportamento().equals(5) )  && raca.getLatido().equals("grosso") && raca.getUivar().equals("s")){
            raca.setNomeRaca("Provavelmente um Pastor Alemão");
        }

         if(raca.getFocinho().equals(2) && raca.getPelagem().equals(1) && raca.getComportamento().equals(2) && raca.getCorDoPelo().equals(3) && raca.getLatido().equals("grosso") && raca.getUivar().equals("n")) {
            raca.setNomeRaca("grandes chances de ser um Pitbull");
        }

        if(raca.getFocinho().equals(2) && (raca.getPelagem().equals(1) || raca.getPelagem().equals(2)) && raca.getComportamento().equals(3)  && (raca.getCorDoPelo().equals(4) || raca.getCorDoPelo().equals(5) || raca.getCorDoPelo().equals(6)) && raca.getLatido().equals("grosso") && raca.getUivar().equals("s")){
            raca.setNomeRaca("Husky Siberiano");
        }
        
        if(raca.getFocinho().equals(1) && (raca.getPelagem().equals(1) && (raca.getCorDoPelo().equals(1) || raca.getCorDoPelo().equals(7) || raca.getCorDoPelo().equals(8)) &&  raca.getComportamento().equals(4) && raca.getLatido().equals("fino") && raca.getUivar().equals("n"))){
            raca.setNomeRaca("pelo tamanho e as outras características diriamos que é um Pinscher");
        }

        if(raca.getFocinho().equals(3) && (raca.getPelagem().equals(1) || raca.getPelagem().equals(2)) &&  raca.getComportamento().equals(5) && raca.getCorDoPelo().equals(3) && raca.getLatido().equals("fino") && raca.getUivar().equals("n")){
             raca.setNomeRaca("comprido assim só pode ser um salsicha Dachshund");
         }

         //impressão ficha animal
         divisorAsterisco();
         System.out.printf("Bem vindo a sua carteira animal digital! %s%n", nome);
         System.out.printf("Possui dono: %s%n", guardadono);
         System.out.printf("O animal possui algum ferimento ou doença? %s%n", saude);
         divisorAsterisco();
         System.out.println("agora as caracteristicas individuais e a conclusão do nosso sistema sobre a possivel raça do animal");
         pulaL();

         switch (raca.getFocinho()) {
             case 1:
                 trueFocinho = "Braquicefálico";
                 break;
         
             case 2:
             trueFocinho = "Mesocefálico";
                 break;
         
             default:
             trueFocinho = "Dolicocefálico";
                 break;
         }
         System.out.printf("Tipo do focinho: %s%n", trueFocinho);

        if (raca.getPelagem() == 1) {
            truePelagem = "Pelos Grossos";
        } else {
            truePelagem = "Pelos Finos";
        }
         System.out.printf("Tipo de pelagem: %s%n", truePelagem);

         switch (raca.getCorDoPelo()) {
             case 1:
                trueCorDoPelo = "Preto com marcas marrom";
                break;
            case 2:
                trueCorDoPelo = "Marrom com marcas amarelas";
                break;
            case 3:
                trueCorDoPelo = "Variado";
                break;
            case 4:
                trueCorDoPelo = "Só preto";
                break;
            case 5:
                trueCorDoPelo = "Só vermelho";
                break;
            case 6:
                trueCorDoPelo = "Branco puro";
                break;
            case 7:
                trueCorDoPelo = "Vermelho cervo";
                break;

             default:
                trueCorDoPelo = "Vermelho castanho";
                 break;
         }
         System.out.printf("A cor do pelo do animal é: %s%n", trueCorDoPelo);

         switch (raca.getComportamento()) {
             case 1:
                 trueComportamento = "equilibrado, dócil e obediente";
                 break;
                 case 2:
                 trueComportamento = "generoso, legal e companheiro";
             break;
             case 3:
                trueComportamento = "brincalhão e acolhedor";
                 break;
             case 4:
                trueComportamento = "excêntrico, protetor e corajoso";
                 break;
         
             default:
                trueComportamento = "dócil e amigavel";
                 break;
         }
         System.out.printf("O comportamento do animal: %s%n", trueComportamento);
         System.out.printf("O latido do animal é: %s%n", raca.getLatido());
         System.out.printf("O cão pode uivar: %s%n", raca.getUivar());
         System.out.printf("Por fim, com todas essas informações, a raça mais semelhante dentro do nosso banco de dados com nosso amiguinho de patas %s é: %s", nome, raca.getNomeRaca());
         pulaL();
         divisorAsterisco();



         pulaL(); //encerra aplicação
         System.out.printf("voce quer encerrar a aplicação ou visualizar os status do %s e brincar com ele?", nome);
         terminaAplicacao = input.nextLine();
         do {
             switch (terminaAplicacao) {
                 case "s":
                     System.out.println("tenha um bom dia/boa tarde/boa noite!");
                     System.exit(0);
                     break;
             
                 case "n":
                     System.out.println("OK! proceguindo para proxima etapa.");
                     break;
             
                 default:
                 tratexcept();
                 terminaAplicacao = input.nextLine();
                     break;
             }
         } while (!terminaAplicacao.equals("s") && !terminaAplicacao.equals("n"));
         divisorAsterisco();
         pulaL();



         DogActions dogeA = new DogActions(nome);
         System.out.printf("Status atual do %s", nome);
         dogeA.showStats();

         input.close();
    }//fim metodo main
    
    private static void tratexcept() {
        System.out.println("Perdão amigo mas digite o código certo.");
    }

    public static void limpatela(){
        for (int i = 0; i < 50; i++) {
            pulaL();
        }
    }
    public static void pulaL(){
        System.out.println("");
    }
    public static void divisorAsterisco(){
        System.out.println("*****///*****///*****///*****///*****///*****///*****");
    }
}//fim classe