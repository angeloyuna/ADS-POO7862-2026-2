package ads.poo.baralho;

public enum Naipe {
    PAUS(1, "\u2663"),
    OUROS(2, "\u2662"),
    COPAS(3, "\u2661"),
    ESPADAS(4, "\u2660");

    public final int valor;
    public final String simbolo;
    
    private Naipe(int valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public int getValor() {
        return valor;
    }

    public String toString() {
        return this.simbolo;
    }
}
