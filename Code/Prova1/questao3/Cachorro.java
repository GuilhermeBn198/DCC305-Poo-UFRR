package questao3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Cachorro {
    /**
     *
     */

    //private static Integer selecionaraca = 0;

    public static void main(String[] args) {

        String nome = "alex";
        String respostadono;
        String dono = "tem";       
        String sentimentos = "tester";
        Boolean saude = true;
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
            // while (nome == null) {     //cuidando de exceções
            //     try {
                     nome = input.nextLine();
            //     } catch (InputMismatchException e) {
            //         System.out.println("PERDÃO MAS NÃO CONSEGUI COMPREENDER PODERIA DIGITAR APENAS CARACTERES?");
            //         nome = input.nextLine();
            //     }
            // }
            pulaL();
        }
        System.out.printf("ENTÃO %s, VOCE TEM UM DONO?%n", nome);
        if (dono == null || dono == "nao tem" || dono == "n") {
            System.out.printf("HMM PARECE QUE %s NÃO TEM UM DONO NÉ... %n NESSE CASO VOCE GOSTARIA DE SER O  NOVO DONO DO %s?('s' para SIM, 'n' para NÃO)%n", nome, nome);
            respostadono = input.nextLine();
            while (respostadono != "s" && respostadono !="n") { //erro de lógica aqui no verificador de erro do problema
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
        System.out.println("AGORA VAMOS VER QUAL A RAÇA DO DOG!");
        pulaL();
        pulaL();
        System.out.println("uma raça de cão tem muitas caracteristicas distintas, entre elas o tamanho do pelo, a cor do mesmo, o tamanho das orelhas, o tipo do crânio, o tipo do latido, alguns até mesmo uivam!");
        System.out.println("temos em nosso banco um total de 5 raças de cachorros, Pastor Alemão, Pitbull, Husky Siberiano, Pinscher e Dachshund");
        pulaL();
        pulaL();
        System.out.println("Pastor Alemão: uma raça de porte grande, com PERSONALIDADE leal, TEMPERAMENTO equilibrado, dócil e obediente. podendo ter PELAGEM curta ou longa. possui um FOCINHO do tipo mesocefálico, sua PELAGEM VARIA entre preto com marcas marrom e marrom com marcas amarelas, pode UIVAR e seu LATIDO tende a ser grosso");
        divisorAsterisco();
        System.out.println("Pitbull: ");
        divisorAsterisco();
        System.out.println("Husky Siberiano: ");
        divisorAsterisco();
        System.out.println("Pinscher: ");
        divisorAsterisco();
        System.out.println("Dachshund: ");
        pulaL();
        pulaL();
        System.out.println("sucesso temporario");
        //lógica p determinar a raça do cão
    //    while (raca.getNomeRaca() == null) {
    //        try {
    //            switch (raca.getNomeRaca()) {
    //                 case 1:
    //                     try {
                            
    //                     } catch (Exception e) {
    //                         //TODO: handle exception
    //                     }
    //                 break;
    //                 case 2:
    //                     try {
                            
    //                     } catch (Exception e) {
    //                         //TODO: handle exception
    //                     }
    //                 break;
    //                 case 3:
    //                     try {
                            
    //                     } catch (Exception e) {
    //                         //TODO: handle exception
    //                     }
    //                 break;
    //                 case 4:
    //                     try {
                            
    //                     } catch (Exception e) {
    //                         //TODO: handle exception
    //                     }
    //                 break;
    //                 case 5:
    //                     try {
                            
    //                     } catch (Exception e) {
    //                         //TODO: handle exception
    //                     }
    //                 break;
        
    //                 default:
    //                 break;
    //             }
    //        } catch (InputMismatchException e) {
    //            //TODO: handle exception
    //        }
    //    } 
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

    // public static void perguntasSwitchRaca(){
    //     System.out.println("Ótimo agora selecione uma das raças para fazer a descrição mais detalhada do cão, temos 6 raças em nosso banco de dados");
    //     System.out.println("A primeira é o Pastor Alemão, com orelhas grandes,");
    //     System.out.println("");
    //     System.out.println("");
    //     System.out.println("");
    //     System.out.println("");

    // }
}
