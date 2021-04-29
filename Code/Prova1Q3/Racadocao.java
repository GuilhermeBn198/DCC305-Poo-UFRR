package questao3;

public class Racadocao extends Cachorro {
    protected Integer nomeraca; //vai ser usado como validador das especies
    protected Integer focinho;
    protected Boolean pelagem;
    protected String cordopelo;
    protected String latido;
    protected String uivar;
//declaração atributos raçadocão
    protected void setNomeRaca(Integer nomeraca){ 
        this.nomeraca = nomeraca;
    } 
    protected void isPelagem(Boolean pelagem){
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
    protected Integer getNomeRaca(){
        return nomeraca;
    }
    protected Boolean getPelagem(){
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
