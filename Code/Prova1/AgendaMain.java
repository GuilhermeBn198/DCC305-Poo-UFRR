import java.util.Scanner; //Biblioteca com os métodos de entrada

public class AgendaMain {
	static void limpatela(){
		for (int i = 0; i < 50; i++) {
			System.out.println("");	
		}
	}
	static void pulaL(){
		System.out.println("");
	}
		
		public static void main(String[] args) {
			limpatela();
		
		//Declaração variaveis
		String nome;
		String curso;
		String periodo;
		Integer numdisciplinas;
		Integer numatividadespergunt = 0;
		Double tempSomaNotas=0.0;
		Double tempMediaNotas=0.0;
		//Scanner
		Scanner input = new Scanner(System.in);
		int tempInt = 0;

		//início do código
		System.out.println("Olá, bem vindo à agenda, digite seu nome.");
		nome = input.nextLine(); //Ler nome
		pulaL();
		
		System.out.println("Agora, informe o seu curso.");
		curso = input.nextLine(); //Ler curso
		pulaL();

		System.out.println("Ótimo, agora identifique o seu periodo(semestre) do curso.");
		periodo = input.nextLine(); //Ler periodo
		pulaL();
		
		System.out.println("Quantas disciplinas vc cursa atualmente?");
		numdisciplinas = input.nextInt();//Ler o numero de disciplinas
		Discipline disciplinas[] = new Discipline[numdisciplinas]; //declara um vetor de objetos tipo discipline
		pulaL();
		//Informações basicas recebidas
		
		//Processo de obtenção de informações mais detalhadas
		System.out.printf("Vc cursa %d disciplinas. %n",numdisciplinas);
		System.out.println("Ótimo, agora vamos descreve-las.");
		pulaL();


		//Preenchimento do vetor de objetos da classe Discipline
		for (int i = 0; i < disciplinas.length; i++) { 
			System.out.printf("DISCIPLINA %d.%n", (i+1) );
			System.out.println("Quantas atividades vc tem atualmente nesta disciplina?");
			numatividadespergunt = input.nextInt(); //Ler o numero de atividades
			System.out.println("");
			disciplinas[i] = new Discipline(numatividadespergunt);


			System.out.printf("Informe o nome da disciplina n%d.%n",(i+1));
			disciplinas[i].setNomeDisciplina(input.next()); //Ler disciplinas[i]
			pulaL();
			
			System.out.println("Otimo, agora informe o horario da disciplina (EX: para 16:35 você digita 1635).");
			disciplinas[i].setHorario(input.nextInt()); //Ler horario da disciplina
			System.out.println("");

			System.out.println("Agora informe o nome do professor.");
			disciplinas[i].setProfessor(input.next()); //Ler o nome do professor da disciplina
			pulaL();
		}

		System.out.println("Agora faremos a descrição das atividades.");
		
		for (int i = 0; i < disciplinas.length; i++) {
			//Processo de obtenção dos dados do vetor de objetos da classe PendentActivities
			
			if (numatividadespergunt > 0) {
			for (int j = 0; j < disciplinas[i].atv.length; j++) {
					disciplinas[i].atv[j] = new PendentActivities();//Inicializa o objeto
					disciplinas[i].atv[j].setNumAtivs(j);
					System.out.printf("Disciplina: %s.%n",disciplinas[i].getNomeDisciplina());
					System.out.printf("Informe o nome da atividade n%s. %n",(j+1));
					disciplinas[i].atv[j].setNomeAtiv(input.next());
					pulaL();

					System.out.print("Informe agora, a data de entrega da atividade.\nDia: ");
					disciplinas[i].atv[j].setdataEntregaD(input.nextInt());
					System.out.print("e Mes: "); disciplinas[i].atv[j].setdataEntregaM(input.nextInt()); 
					pulaL();
					
					System.out.println("Informe a nota.");
					disciplinas[i].atv[j].setNota(input.nextDouble());
					pulaL();
					
				}
			}
		}
		
		//SAIDA 
		limpatela();
		
		System.out.println("***********************************************");
		System.out.printf("Bem vindo à sua agenda, %s!%n",nome);
		System.out.printf("Curso: %s %n", curso);
		System.out.printf("Periodo: %s%n", periodo);
		if (numdisciplinas == 0) {
			System.out.printf("Numero de disciplinas atuais: %d%n", (numdisciplinas));
		} else {
			System.out.printf("Numero de disciplinas atuais: %d%n", (numdisciplinas+1));
		}
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		
		for (int i = 0; i < disciplinas.length; i++) {  //impressao dados das disciplinas
			System.out.println("SETOR DE DISCIPLINAS");
			pulaL();
			System.out.printf("Disciplina: %s%n", disciplinas[i].getNomeDisciplina());
			System.out.printf("Horario: %d%n", disciplinas[i].getHorario());
			System.out.printf("Nome do Professor: %s%n", disciplinas[i].getProfessor());
			System.out.printf("Numero de Atividades Pendentes: %d%n",disciplinas[i].getNAtiv());
			System.out.println("************************************************");
			System.out.println("*************************************************");
			pulaL();

			if (numatividadespergunt > 0) { //impressão dos dados das atividades
				for (int j = 0; j < disciplinas[i].atv.length; j++) {
					System.out.println("SETOR DE ATIVIDADES");
					System.out.printf("Disciplina: %s%n", disciplinas[i].getNomeDisciplina());
					System.out.printf("Atividade n%d%n", disciplinas[i].getNAtiv());		
					System.out.printf("Nome da atividade: %s%n", disciplinas[i].atv[j].getNomeAtiv());
				    System.out.printf("Data de Entrega: %d/%d%n", disciplinas[i].atv[j].getdataEntregaD(),disciplinas[i].atv[j].getdataEntregaM());
					System.out.printf("Nota: %.1f%n", disciplinas[i].atv[j].getNota());
					pulaL();
			}
		}//fim if impressao atividades 
	}//fim for impressao disciplinas

	//Questão 2 - Soma nota e Media da disciplina
	System.out.printf("Informe o n da disciplina o qual voce quer obter a media.%n");
	tempInt = input.nextInt();
	tempSomaNotas=disciplinas[tempInt-1].somaNotas();
	System.out.printf("A soma das notas vale:%.2f%n",tempSomaNotas);
	tempMediaNotas=disciplinas[tempInt-1].media();
	System.out.printf("A media das notas dessa matéria é: %.2f.%n",tempMediaNotas);
	input.close();
}//Fim main

}//fim CLasse
