
/*
package Code.Aula2;//Organiza classes para serem usadas conforme seus diretórios
**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

import java.util.Scanner; //importa a CLASSE Scanner[COM SUAS RESPECTIVAS FUNÇÕES{METHODS/METODOS}] (que permite ler um valor) do pacote java original

public class Aula1ex3LerEPrint { //declaração da função main
    public static void main(String[] args) { 
        //sempre que se quiser executar uma função principal, SÓ PODERÁ EXISTIR UMA FUNÇÃO MAIN por diretório

        Scanner input = new Scanner(System.in); //DEFINIÇÃO de uma nova CLASSE Scanner em "input" para poder usar seus metodos next para ler um valor dado pelo usuario

        int n1, n2, soma; //declaração das variaveis n1, n2 e soma, porém elas ainda precisa sem inicializadas.
        
        System.out.println("\n\nEntre com o primeiro valor: '"); //a função println printa no console a mensagem passada em seu parametro
        n1 = input.nextInt(); //n1 foi inicializada e recebe valores através da função(método/method) contida dentro da classe SCANNER definida como INPUT,  nextInt() consegue recebeer um valor INT do usuario
        
        System.out.println("\n\n\nEntre com o segundo valor: "); //a função println printa no console a mensagem passada em seu parametro
        n2 = input.nextInt();//n1 foi inicializada e recebe valores através da função(método/method) contida dentro da classe SCANNER definida como INPUT,  nextInt() consegue recebeer um valor INT do usuario

        soma = n1 + n2; //soma então é inicializada recebendo os valores de n1 + n2
        
        System.out.println("\n\n\nA soma dos números é: "+soma); //por fim, printa-se a mensagem contida no parametro de println
        
    }
}


*/