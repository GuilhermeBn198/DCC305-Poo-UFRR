/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

package Code.Aula2; //identifica o diretorio do pacote de classes presentes

import java.util.Scanner; //importa classe scanner e todos os seus metodos

public class Aula2ExerEmSala2 { // definição da classe Aula2ExerEmSala2 
    public static void main(String[] args) { //definição de main, para execução/necessário apenas 1 por pasta/diretorio/projeto
        double raio, area; //declaração das variaveis em double
        Scanner  Scan = new Scanner(System.in); //declaração, inicialização e atribuição da classe Scanner em "Scan"
        System.out.print("\n\n\nDigite o raio para se calcular a area da cincunferencia:   "); //serve para externalizar o que estiver escrito dentro de seu parametro
        raio = Scan.nextDouble(); //inicialização e definição de raio para Scan,nextDouble()
        area = Math.PI*Math.pow(raio, 2);// inicialização e definição de raio para pi*raio**2
        System.out.print("\n\n\nO valor da Area da circunferencia é:  "+area+"\n\n\n"); //serve para externalizar o que estiver escrito dentro de seu parametro
    }
}


*/