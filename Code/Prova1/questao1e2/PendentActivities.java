package questao1e2;

class PendentActivities {
    
    
    protected Integer dataEntregaM;
    protected Integer dataEntregaD;
    protected Double nota;
    protected String nomeativ;
    protected Integer numativs;
    
    protected void setNumAtivs(Integer numativs){
        this.numativs = numativs;
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
    protected Integer getNumAtivs(){
        return numativs;
    }
}