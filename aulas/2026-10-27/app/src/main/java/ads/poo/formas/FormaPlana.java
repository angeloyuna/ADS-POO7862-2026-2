package ads.poo.formas;

public abstract class FormaPlana extends FormaGeometrica {

    public FormaPlana(String corLinha, Ponto inicio) {
        super(corLinha, inicio);
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
