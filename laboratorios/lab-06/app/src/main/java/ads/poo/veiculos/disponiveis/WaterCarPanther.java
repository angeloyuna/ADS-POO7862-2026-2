package ads.poo.veiculos.disponiveis;

public class WaterCarPanther {
    
    private boolean isCapoteAberto;
    private boolean isEstabilidadeLigado;
    private boolean isRodasRecolhidas;
    private boolean isLastroVazio;
    private int lastroCapacidadeAtual;
    private final int LASTRO_CAPACIDADE_MAX = 100;
    private int miniGeladeiraTemp;

    public void aumentarGeladeiraTemp() {

        if ((miniGeladeiraTemp += 0.5) > 10) {
            miniGeladeiraTemp = 10;
        } else {
            miniGeladeiraTemp += 0.5;
        }
    }

    public void reduzirGeladeiraTemp() {

        if ((miniGeladeiraTemp -= 0.5) < 0) {
            miniGeladeiraTemp = 0;
        } else {
            miniGeladeiraTemp -= 0.5;
        }
    }
}
