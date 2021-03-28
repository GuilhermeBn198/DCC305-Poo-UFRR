/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

package Code.Aula3.ExercicioEmSala;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("\n\ndigite um numero real para poder ser lido. O programa irá verificar se ele é positivo, se sim ele irá imprimir o dobro do numero, se não, imprimirá o numero ao quadrado ");
        float AA = Scan.nextFloat();
        if (AA > 0) {
            AA = AA*2;
            System.out.println("se o valor tiver sido positivo então o dobro do numero inicial é: "+AA);
        } else {
            AA= AA*AA;
            System.out.println("se o valor tiver sido negativo então o quadrado do numero inicial é: "+AA);
        }
    }
}
 */