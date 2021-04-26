package questao1e2;

class Discipline extends AgendaMain{

    protected static Integer numdisciplinastot = 0; //Atributo estático da classe
    //Atributos do objetos tipo Discipline
    protected Object[] pendentes;
    protected Integer horario;
    protected String professor;
    protected String nomedisciplina;
    protected Integer numatividades;
    
        //Iterador de numdisciplinastot, ativado ao ser criado um objeto Discipline
    Discipline(){
        Discipline.numdisciplinastot = Discipline.numdisciplinastot+1;
    }

    protected void setNumAtividades(Integer numatividades){
        this.numatividades = numatividades;
    }
    protected void setHorario(Integer horario){
        this.horario = horario;
    }
    protected void setProfessor(String professor){
        this.professor = professor;
    }
    protected void setNomeDisciplina(String nomedisciplina){
        this.nomedisciplina = nomedisciplina;
    }
   
    protected String getNomeDisciplina(){
        return nomedisciplina;
    }
    protected Integer getHorario(){
        return horario;
    }
    protected String getProfessor(){
        return professor;
    }
    protected Integer getNumAtividades(){
        return numatividades;
    }
    protected Integer getNumDisciplinastot(){
        return numdisciplinastot;
    }
}
