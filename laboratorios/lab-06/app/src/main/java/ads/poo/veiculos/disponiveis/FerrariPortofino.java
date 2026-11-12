package ads.poo.veiculos.disponiveis;

public class FerrariPortofino {
    
    private boolean isCapoteAberto;
    private boolean isEstabilidadeLigado;

    public void ligarControleEstabilidade() {
        isEstabilidadeLigado = true;
    }

    public void desligarControleEstabilidade() {
        isEstabilidadeLigado = false;
    }
}
