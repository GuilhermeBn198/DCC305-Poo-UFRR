class Discipline extends AgendaMain{
    protected Object[] pendentes;
    protected Integer horario;
    protected String professor;
    protected String nomedisciplina;

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
}
