package ads.poo;

public class Caneta {

    // Método desenhar que recebe as coordenadas inicial e final
    // Se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
    // Se não houver tinta suficiente, retorne -1

    private String cor; // null
    private double nivelTinta; // 0% .. 100%
    private final double CONSUMO_TINTA = 0.01;
    
    public Caneta(String cor, double nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }

    public Caneta(double nivelTinta) {
        this("azul", nivelTinta);
    }

    public Caneta() {
        this(100);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public double drawStraightLine(int origemX, int fimX, int origemY, int fimY) {
        double distancia = Math.sqrt(Math.pow((fimX - origemX), 2) + Math.pow((fimY - origemY), 2));
        double tintaConsumida = CONSUMO_TINTA * distancia;

        if (tintaConsumida > nivelTinta) {
            return -1;
        } else {
            nivelTinta -= tintaConsumida;
            return tintaConsumida;
        }
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        sb.append("Cor: ").append(cor);
        sb.append("\nTinta: ").append(nivelTinta);
        
        return sb.toString();
    }

}