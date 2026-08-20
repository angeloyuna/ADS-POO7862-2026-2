package ads.poo;

public class Contador {
    
    private int valorAtual;
    
    public void atribuirValor(int valor) {
        valorAtual = valor;
    }

    public void incrementarUm() {
        valorAtual++;
    }

    public int obterValorAtual() {
        return valorAtual;
    }
}
