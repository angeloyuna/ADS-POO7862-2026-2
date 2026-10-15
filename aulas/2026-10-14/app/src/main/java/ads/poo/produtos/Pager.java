package ads.poo.produtos;

public class Pager extends Produto {
    
    private int numLinhasDisplay;

    public Pager(int codigo, String numSerie, String modelo, double peso, int numLinhasDisplay) {
        super(codigo, numSerie, modelo, peso);
        this.numLinhasDisplay = numLinhasDisplay;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.toString().replace("Produto", "Pager"));
        sb.append("\n* Número de linhas do display: ").append(numLinhasDisplay);

        return sb.toString();
    }
}
