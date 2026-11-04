package ads.poo.formas;

public class FormaGeometrica {
    
    protected String corLinha;
    protected Ponto inicio;
    
    public FormaGeometrica(String corLinha, Ponto inicio) {
        this.corLinha = corLinha;
        this.inicio = inicio;
    }

    public String desenhar() {
        return "";
    }
}
