package Code.Aula3.ExercicioCasaAula03;

public class Questao4 {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 10; i++) {
            
            fatorial = fatorial * i;
            System.out.println("O fatorial de " + i + "! é igual a " + fatorial);
        }
    }
}