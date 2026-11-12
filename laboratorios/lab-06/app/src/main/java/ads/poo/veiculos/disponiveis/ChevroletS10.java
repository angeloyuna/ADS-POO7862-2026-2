package ads.poo.veiculos.disponiveis;

public class ChevroletS10 {

    private boolean isTracaoAtivada;
    private boolean isCacambaAberta;

    public void abrirCacamba() {
        isCacambaAberta = true;
    }

    public void fecharCacamba() {
        isCacambaAberta = false;
    }
    
}
