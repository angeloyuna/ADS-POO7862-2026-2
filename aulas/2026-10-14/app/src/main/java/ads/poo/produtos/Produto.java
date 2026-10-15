package ads.poo.produtos;

public class Produto {
    
    private int codigo;
    private String numSerie;
    protected String modelo;
    private double peso;
    
    public Produto(int codigo, String numSerie, String modelo, double peso) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("===== Produto =====\n");
        sb.append("* Código: ").append(codigo);
        sb.append("\n* Número de Série: ").append(numSerie);
        sb.append("\n* Modelo: ").append(modelo);
        sb.append("\n* Peso: ").append(peso);

        return sb.toString();
    }
}
