/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

package Code.Aula3.ExercicioEmSala;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        float sal, prestemp;
        System.out.println("n\ninsira seu salario para analisarmos se vc é apto a realizar o empréstimo, a tarifa maxima é de 20%, se for maior que isso não faremos  o empréstimo\n");
        sal = Scan.nextFloat();

        System.out.println("\n\n\ninsira o valor da prestação");
        prestemp = Scan.nextFloat();
        
        if (prestemp >= sal*0.2) {
            System.out.println("Empréstimo não concedido. Infelizmente a prestação que vc deseja não está disponível para sua renda atual");
        }
        else{
            System.out.println("Parabéns, Emprestimo concedido.");
        }
    }

}
 */