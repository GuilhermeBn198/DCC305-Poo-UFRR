// public class ClasseCalculo extends AgendaMain{

//     Integer numedisciplinas;

//     public void obterDadosDiscAtiv(){
//         		//Preenchimento do vetor de objetos da classe Discipline
// 		for (int i = 0; i < disciplinas.length; i++) { 
// 			disciplinas[i] = new Discipline();

// 			System.out.printf("Informe a disciplina %d%n.", (i+1));
// 			disciplinas[i].setNomeDisciplina(input.next()); //Ler disciplinas[i]
// 			pulaL();

// 			System.out.println("Otimo, agora informe o horario da disciplina (EX: para 16:35 você digita 1635");
// 			disciplinas[i].setHorario(input.nextInt()); //Ler horario da disciplina
// 			pulaL();

// 			System.out.println("Agora informe o nome do professor.");
// 			disciplinas[i].setProfessor(input.next()); //Ler o nome do professor da disciplina
// 			pulaL();

// 			System.out.println("Quantas atividades vc tem atualmente nesta disciplina??");
// 			disciplinas[i].setNumAtividades(input.nextInt()); //Ler o numero de atividades
// 			pulaL();
		   
// 			//Processo de obtenção dos dados do vetor de objetos da classe PendentActivities
// 			PendentActivities temppendentes[] = new PendentActivities[disciplinas[i].getNumAtividades()];
// 			pendentes = temppendentes;
			
// 			if ((disciplinas[i].getNumAtividades()) > 0) {
// 			for (int j = 0; j < temppendentes.length; j++) {
// 				System.out.println("Agora faremos a descrição das atividades");
// 				temppendentes[j] = new PendentActivities();//Cria objeto 

// 				System.out.printf("Informe o nome da atividade n%s %n",(j+1));
// 				temppendentes[j].setNomeAtiv(input.next());
// 				pulaL();

// 				System.out.println("Informe agora, a data de entrega da atividade. ");
// 				System.out.print("Dia: "); temppendentes[j].setdataEntregaD(input.nextInt());
// 				System.out.print("Mes: "); temppendentes[j].setdataEntregaM(input.nextInt()); 
// 				pulaL();
				
// 				System.out.println("Informe a nota.");
// 				temppendentes[j].setNota(input.nextDouble());
// 				pulaL();
// 				}//Fim for descrição atividades
// 			}//Fim if atividades da disciplina maior que 0
// 		}//Fim for disciplina em numero de disciplinas
//     }

//     public void mostraAgenda(){

// 		// processo de impressao dos dados da agenda ao Aluno
// 		clearConsole(); //limpa tela que nao ta limpando tela
		
// 		System.out.printf("Bem vindo à sua agenda, %s!%n",nome);
// 		System.out.printf("Curso: %s %n", curso);
// 		System.out.printf("Periodo: %s%n", periodo);
// 		System.out.printf("Numero de disciplinas atuais: %d%n", numedisciplinas);
// 		System.out.println("**********************************************");
// 		System.out.println("************************************************");
// 		System.out.println("*******///**********DISCIPLINAS************///********");
// 		System.out.printf("%n%n");
// 		for (int i = 0; i < disciplinas.length; i++) {  //impressao dados das disciplinas
// 			System.out.printf("Disciplina: %s%n", disciplinas[i].getNomeDisciplina());
// 			System.out.printf("Horario: %d%n", disciplinas[i].getHorario());
// 			System.out.printf("Nome do Professor: %s%n", disciplinas[i].getProfessor());
// 			System.out.printf("Numero de Atividades pendentes da materia: %d%n",disciplinas[i].getNumAtividades());
// 			//System.out.printf("soma da nota de todas as atividades da materia:", somaNota());
// 			System.out.println("*********///*************///****************///**********");
// 		}//fim for impressao disciplinas
		
// 		System.out.println("*******************ATIVIDADES*****************");
// 		pulaL();
// 		for (int i = 0; i < disciplinas.length; i++) {
// 			System.out.printf("Atividade da disciplina: %s%n", disciplinas[i].getNomeDisciplina());	
// 			if (disciplinas[i].getNumAtividades() > 0) { //impressão dos dados das atividades
// 				for (int j = 0; j <= pendentes.length; j++) { 	
// 					System.out.printf("Nome da atividade: %s%n", pendentes[j].getNomeAtiv());
// 				   System.out.printf("Data de Entrega: %d/%d%n", pendentes[j].getdataEntregaD(),pendentes[j].getdataEntregaM());
// 					System.out.printf("Nota: %.1f%n", pendentes[j].getNota());
// 					System.out.println("**************************************************");
// 					pulaL();
// 				}//Fim for atividades da disciplina
// 			}//Fim if nativ maior que 0
// 		}// Fim for n disciplinas

//     }
//     public ClasseCalculo()
//     {

//     }
// }
