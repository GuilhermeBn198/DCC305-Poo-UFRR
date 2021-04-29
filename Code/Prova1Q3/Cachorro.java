

import java.util.Scanner;
import java.util.InputMismatchException;

public class Cachorro {

    public static void main(String[] args) {

        String nome = "alex";
        String respostadono;
        String dono = "tem";       
        String saude;
        Scanner input = new Scanner(System.in);
        Racadocao raca = new Racadocao();
        //parte impressa
        limpatela();
        System.out.println("OLÁ BEM VINDO AO SISTEMA DE CADASTRO ANIMAL, O DOG TEM NOME?");
        if (nome != null) {
            System.out.printf("OHH QUE NOME BONITO %s%n", nome);
        } else {
            System.out.println("... pelo visto não...");
            System.out.println("ENTÃO VAMOS DAR UM NOME AO DOGUINHO! ");
            nome = input.nextLine();
        }
        pulaL();

        System.out.printf("ENTÃO %s, VOCE TEM UM DONO?%n", nome);
        if (dono == null || dono == "nao tem" || dono == "n") {
            System.out.printf("HMM PARECE QUE %s NÃO TEM UM DONO NÉ... %n NESSE CASO VOCE GOSTARIA DE SER O  NOVO DONO DO %s?('s' para SIM, 'n' para NÃO)%n", nome, nome);
            respostadono = input.nextLine();
            while (respostadono != "s" && respostadono !="n") { 
                switch (respostadono) {
                case "s":
                    System.out.println("OHH QUE LEGAL!!");
                    respostadono = "s";
                    dono = "tem";
                    break;
                case "n":
                    System.out.println("OHH TUDO BEM ENTÃO CUIDAREMOS DELE SIM!");
                    respostadono = "n";
                    dono = "não tem";
                    break;
                default:
                    System.out.println("!!!!por favor digite apenas 's' ou 'n' para afirmar a resposta!!!!");
                    respostadono = input.nextLine();
                    break;
                }
            }
        } else {
            System.out.println("OHH QUE OTIMO ENTÃO!");
        }

        System.out.printf("%s está com algum ferimento?%n", nome);
        saude = input.nextLine();
        pulaL();

        System.out.println("AGORA VAMOS VER QUAL A RAÇA DO DOG!");
        pulaL();
        pulaL();
        System.out.println("uma raça de cão tem muitas caracteristicas distintas, entre elas o tamanho do pelo, a cor do mesmo, o tipo do crânio, o tipo do latido, alguns até mesmo uivam!");
        System.out.println("temos em nosso banco um total de 5 raças de cachorros, Pastor Alemão, Pitbull, Husky Siberiano, Pinscher e Dachshund");
        pulaL();
        pulaL();
        System.out.println("Pastor Alemão: uma raça de porte grande, com personalidade leal, TEMPERAMENTO equilibrado, dócil e obediente. podendo ter PELAGEM curta ou longa. possui um FOCINHO do tipo mesocefálico, sua COR DE PELOS VARIA entre preto com marcas marrom e marrom com marcas amarelas, pode UIVAR e seu LATIDO tende a ser grosso");
        divisorAsterisco();
        System.out.println("Pitbull: Ao contrario da crença popular de que são animais de TEMPERAMENTO agressivo e rude, é na verdade uma raça muito generosa, legal e companheira,  de PELAGEM curta, possui um FOCINHO do tipo mesocefálico e a COR DE SEUS PELOS é bastante variada,  LATEM grosso");
        divisorAsterisco();
        System.out.println("Husky Siberiano: SÃO bastante brincalhões e acolhedores, com PELAGEM longa, possui um FOCINHO do tipo mesocefálico e a COR DE SEUS PELOS varia desde o preto até o branco puro,  LATE grosso e pode UIVAR.");
        divisorAsterisco();
        System.out.println("Pinscher: uma raça de porte pequeno, podendo sere acomodado em pequenos apartametnos, tem um TEMPERAMENTO bastante excêntrico, protetor e corajoso. Sua PELAGEM é curta e tem um FOCINHO do tipo braquiocefálico(Curto), a COR DOS PELOS pode preto e castanho ou só vermelho cervo ou vermelho castanho. LATE fino(muuuuito).");
        divisorAsterisco();
        System.out.println("Dachshund: TEMPERAMENTO dócil e amigavel, FOCINHO dolicocefálico, sua PELAGEM pode ser longa ou curta. A COR DOS PELOS pode ser bastante variada e latem fino. ");
        pulaL();
        pulaL();
        System.out.println("COM BASE NESSAS INFORMAÇÕES QUE FORAM PASSADAS A VOCE ACHO Q VC SABERÁ DESCREVER AS CARACTERISTICAS DO CÃO.");
        pulaL();
        pulaL();

        System.out.println("descreva o focinho do cão, digitando o código relativo ao tipo\n1 para braquiocefálico\n2 para mesocefálico\n3 para dolicocefálico:");
        raca.setFocinho(input.nextInt());
        while (!raca.getFocinho().equals(1) && !raca.getFocinho().equals(2) && !raca.getFocinho().equals(3)) {
            try {
                tratexcept();
                raca.setFocinho(input.nextInt());
               raca.getFocinho();
            } catch (Exception e) {
                tratexcept();
                raca.setFocinho(input.nextInt());
                raca.getFocinho();
            }
        }
        input.nextLine();  // consome resto da linha

        pulaL();
        System.out.println("descreva agora qual o tipo de pelagem do cão, digitando o código relativo ao tipo\n1 para curto\n2 para longo:");
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

        pulaL();
        System.out.printf("descreva o comportamento do animal. variando entre: %n'equilibrado, dócil e obediente' %n'generosa, legal e companheira,' %n'brincalhão e acolhedor' %n'excêntrico, protetor e corajoso' %n'dócil e amigavel' %nrespectivamente seus códigos são 1, 2, 3, 4 e 5: ");
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
        pulaL();
        System.out.println("descreva agora qual a cor dos pelos do cão:");
        raca.setCorDoPelo(input.nextLine());

        pulaL();
        System.out.println("descreva o latido do cão(entre grosso ou fino):");
        raca.setLatido(input.nextLine());
        while (!raca.getLatido().equals("grosso")  && !raca.getLatido().equals("fino")){
            try {
                tratexcept();
                raca.setLatido(input.nextLine());
            } catch (Exception e) {
                tratexcept();
                raca.setLatido(input.nextLine());
            }
        }
        pulaL();
         System.out.println("fale se o cão pode uivar:('s' para sim e 'n' para não)");
        raca.setUivar(input.nextLine());
        while (!raca.getUivar().equals("s") && !raca.getUivar().equals("n")) {
            try {
                tratexcept();
                raca.setUivar(input.nextLine());
            } catch (Exception e) {
                tratexcept();
                raca.setUivar(input.nextLine());
            }
        }

        // System.out.println(raca.getFocinho());
        // System.out.println(raca.getPelagem());
        // System.out.println(raca.getCorDoPelo());
        // System.out.println(raca.getComportamento);
        // System.out.println(raca.getLatido());
        // System.out.println(raca.getUivar());
        // raca.getLatido().equals("grosso")

        //lógica p determinar a raça do cão
        if(raca.getFocinho().equals(2) && (raca.getPelagem().equals(1) || raca.getPelagem().equals(2))  && (raca.getCorDoPelo().equals("preto com marcas marrom") || raca.getCorDoPelo().equals("marrom com marcas amarelas")) &&  (raca.getComportamento().equals(1) || raca.getComportamento().equals(5) )  && raca.getLatido().equals("grosso") && raca.getUivar().equals("s")){
            raca.setNomeRaca("Pastor Alemão");
        }
        System.out.println(raca.getNomeRaca());
        // if () {
            
        //     raca.setNomeRaca("Pitbull");
        // }

        // if(){
        //     raca.setNomeRaca("Husky Siberiano");
        // }
        // if(){
        //     raca.setNomeRaca("Pinscher");
        // }
        // if(){
        //     raca.setNomeRaca("Dachshund");
        // }

    }//fim metodo main
    
    private static void tratexcept() {
        System.out.println("perdão amigo mas digite o código certo.");
    }

    public static void limpatela(){
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    public static void pulaL(){
        System.out.println("");
    }
    public static void divisorAsterisco(){
        System.out.println("*****///*****///*****///*****///*****///*****///*****");
    }
}
