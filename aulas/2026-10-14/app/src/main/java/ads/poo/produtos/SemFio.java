package ads.poo.produtos;

public class SemFio extends Telefone {
 
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    public SemFio(int codigo, String numSerie, String modelo, double peso, String modoDeDiscagem, double frequencia, int canais,
            double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, modoDeDiscagem);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override // Sobreescrita de método
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.toString().replace("Telefone", "Telefone Sem Fio"));
        sb.append("\n* Frequência: ").append(frequencia);
        sb.append("\n* Canais: ").append(canais);
        sb.append("\n* Distancia de Operação: ").append(distanciaOperacao);

        return sb.toString();
    }


}
