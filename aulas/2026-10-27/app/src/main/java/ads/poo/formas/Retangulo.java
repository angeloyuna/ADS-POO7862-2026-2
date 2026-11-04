package ads.poo.formas;

public class Retangulo extends FormaPlana {
    
    private Ponto fim;
    
    public Retangulo(String corLinha, Ponto inicio, Ponto fim) {
        super(corLinha, inicio);
        this.fim = fim;
    }

    @Override
    public double calcularArea() {
        return Math.abs((fim.getY() - inicio.getY())) * Math.abs((fim.getX() - inicio.getX()));
    }

    @Override
    public double calcularPerimetro() {
        return Math.abs((fim.getY() - inicio.getY())) * 2 + Math.abs((fim.getX() - inicio.getX())) * 2;
    }

    @Override
    public String desenhar() {

        String area = String.format("%.2f", calcularArea());        
        String perimetro = String.format("%.2f", calcularPerimetro());

        return String.format("* Desenhado um retângulo de cor %s nas coordenadas de [%d,%d] até [%d,%d] com área de %s cm² e perimetro de %s cm", corLinha, inicio.getX(), inicio.getY(), fim.getX(), fim.getY(), area, perimetro);
    }

    
}
