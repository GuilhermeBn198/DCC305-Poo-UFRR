

public class Racadocao extends Cachorro {
    protected String nomeraca; //vai ser usado como validador das especies
    protected Integer comportamento;
    protected Integer focinho;
    protected Integer pelagem;
    protected String cordopelo;
    protected String latido;
    protected String uivar;
//declaração atributos raçadocão
    protected void setNomeRaca(String nomeraca){ 
        this.nomeraca = nomeraca;
    } 
    protected void setComportamento(Integer comportamento){ 
        this.comportamento = comportamento;
    } 
    protected void setPelagem(Integer pelagem){
        this.pelagem = pelagem;
    }
    protected void setFocinho(Integer focinho){
        this.focinho = focinho;
    }
    protected void setCorDoPelo(String cordopelo){
        this.cordopelo = cordopelo;
    }
    protected void setLatido(String latido){
        this.latido = latido;
    }
    protected void setUivar(String uivar){
        this.uivar = uivar;
    }
    protected String getNomeRaca(){
        return nomeraca;
    }
    protected Integer getComportamento(){
        return comportamento;
    }
    protected Integer getPelagem(){
        return pelagem;
    }
    protected Integer getFocinho(){
        return focinho;
    }
    protected String getCorDoPelo(){
        return cordopelo;
    }
    protected String getLatido(){
        return latido;
    }
    protected String getUivar(){
        return uivar;
    }


}
