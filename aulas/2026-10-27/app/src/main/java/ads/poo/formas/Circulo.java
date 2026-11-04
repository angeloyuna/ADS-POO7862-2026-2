package ads.poo.formas;

public class Circulo extends FormaPlana {
    
    private double raio;

    public Circulo(String corLinha, Ponto inicio, double raio) {
        super(corLinha, inicio);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String desenhar() {

        String raio = String.format("%.2f", this.raio);
        String area = String.format("%.2f", calcularArea());        
        String perimetro = String.format("%.2f", calcularPerimetro());

        return String.format("* Desenhado um círculo de cor %s nas coordenadas de [%d,%d] com raio de %s cm, área de %s cm² e perimetro de %s cm", corLinha, inicio.getX(), inicio.getY(), raio, area, perimetro);

    }
}