public class TestaCasa {
    public static void main(String[] args) {
        // Cria casa
        Casa minhaCasa = new Casa(2);

        // Cria porta
        Porta novaPorta = new Porta("aberta");
        // Adiciona valor boleano diretamente ao atributo class Porta
        novaPorta.aberta = true;

        novaPorta.estaAberta();
        // Valores originais atributos da Casa
        minhaCasa.cor = "Amarelo";

        // Modificando os valores metódos class Casa
        minhaCasa.pinta("Branco");
        minhaCasa.adicionaPorta(novaPorta);
        minhaCasa.quantasPortasEstaoAbertas();
        minhaCasa.mostraTotalDePortas();
    }
}
