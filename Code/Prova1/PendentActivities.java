class PendentActivities extends Discipline  {
    protected Integer dataEntregaM;
    protected Integer dataEntregaD;
    protected Double nota;
    protected String nomeativ;
    protected static Double notassoma = 0.0;

    PendentActivities(){
        PendentActivities.notassoma = this.nota;
    }
    protected void setdataEntregaD(Integer dataEntregaD){ //define dataEntregaD
            this.dataEntregaD = dataEntregaD;
    }
    protected void setdataEntregaM(Integer dataEntregaM){ //define dataEntregaM
            this.dataEntregaM = dataEntregaM;
    }
    protected void setNota(Double nota) { //define nota
        this.nota = nota;
    }
    protected void setNomeAtiv(String nomeativ) { //define nomeativ
        this.nomeativ = nomeativ;
    }
    protected Integer getdataEntregaD(){ //pega dataEntregaD
        return dataEntregaD;
    }
    protected Integer getdataEntregaM(){ //pega dataEntregaM
        return dataEntregaM;
    }
    protected Double getNota(){ //pega nota
        return nota;
    }
    protected String getNomeAtiv(){
        return nomeativ;
    }
    
}