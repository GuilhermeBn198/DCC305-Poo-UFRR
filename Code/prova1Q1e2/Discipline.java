class Discipline{
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
    protected Double somaNotas(){
        Double sumNotes=0.0;
        for(int k=0;k<this.nAtiv;k++){
            sumNotes=sumNotes+this.atv[k].getNota();
        }
        return sumNotes;
    }

    protected Double media(){
        Double mediaArit=0.0;
        mediaArit=this.somaNotas()/this.nAtiv;
        return mediaArit;
        }
}

