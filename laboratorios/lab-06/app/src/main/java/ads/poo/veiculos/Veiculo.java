package ads.poo.veiculos;

public abstract class Veiculo {
    
    private String id;
    private int velocidadeAtual;
    private final int VELOCIDADE_MAX = 200;
    
    public abstract void acelerar();
    public abstract void frear();
}
