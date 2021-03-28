/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
**************

 package Code.Aula1e2.ExercicioEmSala;
import java.util.Scanner;

 * Nome: Guilherme Lucas Pereira Bernardo 
 * data: 28/03/21
 * questao4
 	 public class Questao4 {

	public static void main(String[] args) {
		System.out.println("digite o numero de repetiçoes");
		Scanner sc = new Scanner (System.in);
		int repet = sc.nextInt();
		int valor[] = new int[repet];
		int maior = 0, menor = 0; 
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = sc.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
	}
} 
*/ 