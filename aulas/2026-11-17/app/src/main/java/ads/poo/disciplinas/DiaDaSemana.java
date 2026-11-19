package ads.poo.disciplinas;

public enum DiaDaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERCA(3, "terça-feira"),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sábado");
    
    public final int codigo;
    public final String extenso;
    
    private DiaDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }
    
    public String toString() {
        return this.extenso;
    }
}