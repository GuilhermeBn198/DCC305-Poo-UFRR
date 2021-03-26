/*

**************
DESCOMENTAR ESSE CÓDIGO CASO QUERIA EXECUTÁ-LO(E COMENTAR OUITRO CÓDIGO MAIN AO MESMO TEMPO)
***************

package Code.Aula3;
public class Aula3Ex3Switch {
    public static void main(String[] args) {
        Days day = Days.SATURDAY; //instanciacao da classe'/inicializacao
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println("chaato");    
            break;
            case THURSDAY:
            case FRIDAY:
                System.out.println("hmm ta ficando melhor");
            break;
            case SATURDAY:
                System.out.println("hmm ta mt bom");
            break;
            case SUNDAY:
                 System.out.println("hmmm ta perfeito");
            break;
            
            default: System.out.println("eh algo por ai");
            break;
        }
    }
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
 */