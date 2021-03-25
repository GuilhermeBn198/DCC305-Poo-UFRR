package Code.Aula1e2;
/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

package Code.Aula2;//Organiza classes para serem usadas conforme seus diretórios.

import java.util.Scanner;  //importa a CLASSE Scanner[COM SUAS RESPECTIVAS FUNÇÕES{METHODS/METODOS}] (que permite ler um valor) do pacote java original

public class Aula2ExerEmSala1 {  //declaração de uma função main
    public static void main(String[] args) { //sempre que se quiser executar uma função principal, SÓ PODERÁ EXISTIR UMA FUNÇÃO MAIN por diretório
        float A, B, Media; //declaração das variaveis A, B e Media, porém elas ainda precisa sem inicializadas.

        Scanner Scan = new Scanner(System.in);  //DEFINIÇÃO de uma nova CLASSE Scanner em "Scan" para poder usar seus metodos next para ler um valor dado pelo usuario


        System.out.println("\n\n\n Digite a nota da primeira prova");  //a função println printa no console a mensagem passada em seu parametro
        A = Scan.nextFloat(); //A foi inicializada e recebe valores através da função(método/method) contida dentro da classe SCANNER definida como SCAN,  o metodo nextFloat() consegue receber um valor Float do usuario
        
        System.out.println("\n\n\nDigite a nota da segunda prova: ");  //a função println printa no console a mensagem passada em seu parametro
        B = Scan.nextFloat(); //B foi inicializada e recebe valores através da função(método/method) contida dentro da classe SCANNER definida como SCAN,  o metodo nextFloat() consegue receber um valor Float do usuario

        Media = (A + B)/2; //soma então é inicializada recebendo os valores de A + B divididos pelo numero de provas, no caso 2.

        System.out.println("\n\n\nA Média das duas provas é: "+Media); //por fim, printa-se a mensagem contida no parametro de println
    }
}


*/