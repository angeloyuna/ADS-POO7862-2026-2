package ads.poo.formas;

public abstract class FormaGeometrica {
    
    protected String corLinha;
    protected Ponto inicio;
    
    public FormaGeometrica(String corLinha, Ponto inicio) {
        this.corLinha = corLinha;
        this.inicio = inicio;
    }

    public abstract String desenhar();
}
