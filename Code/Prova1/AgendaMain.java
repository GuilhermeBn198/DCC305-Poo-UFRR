import java.io.IOException; //biblioteca do limpa dela
import java.util.Scanner;

public class AgendaMain {
		
		public static void main(String[] args) throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpa tela
		
		//declaração variaveis
		String nome;
		String curso;
		String periodo;
		Integer numdisciplinas;
		Integer numatividades = 0;

		//Scanners
		Scanner input = new Scanner(System.in);
		String tempstring;
		Integer tempint;
		Double tempdouble;
		

		//início do código
		System.out.println("Olá, bem vindo à agenda, digite seu nome.");
		nome = input.next(); //Ler nome
		System.out.println("");
		
		System.out.println("Agora, informe o seu curso.");
		curso = input.next(); //Ler curso
		System.out.println("");

		System.out.println("Ótimo, agora identifique o seu período(semestre) do curso.");
		periodo = input.next(); //Ler periodo
		System.out.println("");
		
		System.out.println("Quantas disciplinas vc cursa atualmente?");
		numdisciplinas = input.nextInt();//Ler o numero de disciplinas
		Discipline disciplinas[] = new Discipline[numdisciplinas]; //declara um vetor de objetos tipo discipline
		System.out.println("");
		//Informações basicas recebidas
		
		//Processo de obtenção de informações mais detalhadas
		System.out.printf("Vc cursa %d disciplinas. %n",numdisciplinas);
		System.out.println("Ótimo, agora vamos descreve-las.");
		System.out.println("");

		//Preenchimento do vetor de objetos da classe Discipline
		for (int i = 0; i < disciplinas.length; i++) { 
			disciplinas[i] = new Discipline();

			System.out.printf("Informe a disciplina n%d%n.",(i+1));
			tempstring = input.next();
			disciplinas[i].setNomeDisciplina(tempstring); //Ler disciplinas[i]
			System.out.println("");

			System.out.println("Otimo, agora informe o horario da disciplina (EX: para 16:35 você digita 1635");
			tempint =input.nextInt();
			disciplinas[i].setHorario(tempint); //Ler horario da disciplina
			System.out.println("");

			System.out.println("Agora informe o nome do professor.");
			tempstring = input.next();
			disciplinas[i].setProfessor(tempstring); //Ler o nome do professor da disciplina
			System.out.println("");

			System.out.println("Quantas atividades vc tem atualmente nesta disciplina??");
			numatividades = input.nextInt(); //Ler o numero de atividades
			System.out.println("");
		   
			//Processo de obtenção dos dados do vetor de objetos da classe PendentActivities
			PendentActivities pendentes[] = new PendentActivities[numatividades];
			System.out.println("Agora faremos a descrição das atividades");
			
			if (numatividades > 0) {
			for (int j = 0; j < pendentes.length; j++) {
					pendentes[j] = new PendentActivities();//Cria objeto 

					System.out.printf("Informe o nome da atividade n%s",(j+1));
					tempstring = input.next();
					pendentes[j].setNomeAtiv(tempstring);
					System.out.println("");

					System.out.print("Informe agora, a data de entrega da atividade. %nDia:");tempint = input.nextInt();
					pendentes[j].setdataEntregaD(tempint); System.out.print(" e Mes: ");tempint = input.nextInt(); pendentes[j].setdataEntregaM(tempint); 
					System.out.println("");
					
					System.out.println("Informe a nota.");
					tempdouble = input.nextDouble();
					pendentes[j].setNota(tempdouble);
					System.out.println("");
					
				}
			}
		}
		
		
		//processo de mostragem dos dados da agenda ao Aluno
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpa tela
		System.out.println("***********************************************");
		System.out.printf("Bem vindo à sua agenda, %s!%n",nome);
		System.out.printf("Curso: %s", curso);
		System.out.printf("Periodo: %s%n", periodo);
		System.out.printf("quantidade de disciplinas atuais: %s%n", numdisciplinas);
		System.out.println("**********************************************");
		System.out.println("************************************************");
		System.out.println("SETOR DE DISCIPLINAS");
		for (int i = 0; i < disciplinas.length; i++) {  //impressao dados das disciplinas
			disciplinas[i] = new Discipline();
			System.out.printf("Disciplina: %s%n", disciplinas[i].getNomeDisciplina());
			System.out.printf("Horario: %s%n", disciplinas[i].getHorario());
			System.out.printf("Nome do Professor: %s%n", disciplinas[i].getProfessor());
			System.out.printf("Numero de Atividades Pendentes: %s%n",numatividades);
			System.out.println("************************************************");
			System.out.println("*************************************************");
			System.out.println("SETOR DE ATIVIDADES");
			if (numatividades > 0) { //impressão dos dados das atividades
				PendentActivities pendentes[] = new PendentActivities[numatividades]; 
				for (int j = 0; j < pendentes.length; j++) {
					pendentes[j] = new PendentActivities();
					System.out.printf("Atividade n%s%n", numatividades);		
					System.out.printf("Nome da atividade: %s%n", pendentes[j].getNomeAtiv());
				    System.out.printf("Data de Entrega: %s/%s%n", pendentes[j].getdataEntregaD(),pendentes[j].getdataEntregaM());
					System.out.printf("Nota: %d%n", pendentes[j].getNota());
			}
		}//fim if impressao atividades 
	}//fim for impressao disciplinas
}//Fim main

	// private void somaNota(){
		

	// 	}//fim somaNota
	
}//fim CLasse
