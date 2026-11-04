package ads.poo.formas;

public class Linha extends FormaGeometrica {
    
    private Ponto fim;
    
    public Linha(String corLinha, Ponto inicio, Ponto fim) {
        super(corLinha, inicio);
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return String.format("* Desenhado uma linha de cor %s nas coordenadas de [%d,%d] até [%d,%d]", corLinha, inicio.getX(), inicio.getY(), fim.getX(), fim.getY());
    }  
}
