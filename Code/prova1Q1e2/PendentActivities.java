class PendentActivities {

    protected Integer dataEntregaM; // data entrega MES
    protected Integer dataEntregaD; // data entrega DIA
    protected Double nota; // nota da atividade
    protected String nomeativ; // nome da atividade
    protected Integer numativs; // numero de atividades

    protected void setNumAtivs(Integer numativs) { // define o numero de atividades
        this.numativs = numativs;
    }

    protected void setdataEntregaD(Integer dataEntregaD) { // define dataEntregaD
        this.dataEntregaD = dataEntregaD;
    }

    protected void setdataEntregaM(Integer dataEntregaM) { // define dataEntregaM
        this.dataEntregaM = dataEntregaM;
    }

    protected void setNota(Double nota) { // define nota
        this.nota = nota;
    }

    protected void setNomeAtiv(String nomeativ) { // define nomeativ
        this.nomeativ = nomeativ;
    }

    protected Integer getdataEntregaD() { // pega dataEntregaD
        return dataEntregaD;
    }

    protected Integer getdataEntregaM() { // pega dataEntregaM
        return dataEntregaM;
    }

    protected Double getNota() { // pega nota
        return nota;
    }

    protected String getNomeAtiv() { // pega nome da atividade
        return nomeativ;
    }

    protected Integer getNumAtivs() { // pega o numero de atividades
        return numativs;
    }
}