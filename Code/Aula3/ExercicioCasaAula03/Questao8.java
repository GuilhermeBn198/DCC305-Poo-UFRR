package Code.Aula3.ExercicioCasaAula03;
import java.util.Scanner;

public class Questao8 {
    public static int test(int x) {
        if ((x%2)==0) 
            x = x/2;
        else
            x = 3 * x + 1;
        return x;
    }      

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um valor para x:");
        int x = scan.nextInt();

        for (int i = x; i >= 5 ; i--) {
            x = test(x);
            System.out.print(x+"  ");
        }

    }   
}
