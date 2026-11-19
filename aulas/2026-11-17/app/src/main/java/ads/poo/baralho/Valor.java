package ads.poo.baralho;

public enum Valor {
    AS(1, "A"),
    DOIS(2, "2"),
    TRES(3, "3"),
    QUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "7"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    VALETE(11, "J"),
    DAMA(12, "Q"),
    REI(13, "K");
    
    public final int valor;
    public final String simbolo;
    
    private Valor(int valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String toString() {
        return this.simbolo;
    }
}