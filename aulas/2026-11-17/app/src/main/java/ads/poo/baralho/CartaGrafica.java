package ads.poo.baralho;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta {
    
    private double x;
    private double y;

    public CartaGrafica(Valor valor, Naipe naipe, double x, double y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public String retornarNomeImagem() {
        
        String imgValor;
        String imgNaipe;

        imgValor = valor.getSimbolo().toLowerCase();
        
        switch (naipe.getValor()) {
            case 1 -> imgNaipe = "p";
            case 2 -> imgNaipe = "o";
            case 3 -> imgNaipe = "c";
            case 4 -> imgNaipe = "e";
            default -> throw new RuntimeException();
        }

        return "cartas/" + imgValor + imgNaipe + ".png";
    }

    public void desenhar(Draw draw) {
        draw.picture(this.x, this.y, this.retornarNomeImagem());
    }

    
}
