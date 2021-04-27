package questao1e2;

class Discipline{
    protected Object[] pendentes;
    protected Integer horario;
    protected String professor;
    protected String nomedisciplina;
    protected Integer nAtiv;
    protected PendentActivities atv[];
    
    //Construtor
    public Discipline(Integer n)
    {
        this.nAtiv = n;
        atv = new PendentActivities[nAtiv];
    }

    //SETTERS

    protected void setHorario(Integer horario){
        this.horario = horario;
    }
    protected void setProfessor(String professor){
        this.professor = professor;
    }
    protected void setNomeDisciplina(String nomedisciplina){
        this.nomedisciplina = nomedisciplina;
    }
   //GETTERS
    protected String getNomeDisciplina(){
        return nomedisciplina;
    }
    protected Integer getHorario(){
        return horario;
    }
    protected String getProfessor(){
        return professor;
    }
    protected Integer getNAtiv(){
        return nAtiv;
    }
}
