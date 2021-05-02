class Discipline {
    protected Integer horario;
    protected String professor; // nome do professor
    protected String nomedisciplina; // nome da disciplina
    protected Integer nAtiv; // numero de atividades de uma disciplina
    protected PendentActivities atv[]; // array de pendentactivities dentro de disciplina

    // Construtor
    public Discipline(Integer n) {// construtor define o numero de atividades de uma disciplina
        this.nAtiv = n;
        atv = new PendentActivities[nAtiv];
    }

    // SETTERS
    protected void setHorario(Integer horario) { // define horario
        this.horario = horario;
    }

    protected void setProfessor(String professor) { // define nome do professor
        this.professor = professor;
    }

    protected void setNomeDisciplina(String nomedisciplina) { // define o nome da disciplina
        this.nomedisciplina = nomedisciplina;
    }

    // GETTERS
    protected String getNomeDisciplina() { // pega o nome da disciplina
        return nomedisciplina;
    }

    protected Integer getHorario() { // pega o horario de uma disciplina
        return horario;
    }

    protected String getProfessor() { // pega o nome do professor de uma disciplina
        return professor;
    }

    protected Integer getNAtiv() { // pega o numero de atividades de uma disciplina
        return nAtiv;
    }

    // MÉTODOS
    protected Double somaNotas() { // soma as notas de todas as atividades de uma disciplina
        Double sumNotes = 0.0;
        for (int k = 0; k < this.nAtiv; k++) {
            sumNotes = sumNotes + this.atv[k].getNota();
        }
        return sumNotes;
    }

    protected Double media() { // faz a média de todas as atividades de uma disciplina
        Double mediaArit;
        mediaArit = this.somaNotas() / this.nAtiv;
        return mediaArit;
    }
}
