package Code.Aula3.ExercicioCasaAula03;

public class Questao5E6 {
    public static void main(String[] args) {
        long fatorial = 1;
	for (long n = 1; n <= 40; n++) {
		
		fatorial = fatorial * n;
		System.out.println("O fatorial de " + n + "! é igual a " + fatorial);
		
	}
    }
}
//R: essa mudança nos resultados é ocorrida por causa do tamanho do tipo de dado LONG ser maior em armazenamento do que o INTEIRO