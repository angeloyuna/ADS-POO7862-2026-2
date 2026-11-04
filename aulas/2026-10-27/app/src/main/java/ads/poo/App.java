package ads.poo;

import ads.poo.formas.Circulo;
import ads.poo.formas.Linha;
import ads.poo.formas.Ponto;
import ads.poo.formas.Retangulo;

public class App {

    public static void main(String[] args) {

        Linha li = new Linha("azul", new Ponto(1, 2), new Ponto(3, 4));
        Circulo circ = new Circulo("verde", new Ponto(7, 7), 5);
        Retangulo ret = new Retangulo("preto", new Ponto(2, 0), new Ponto(4, 4));

        IO.println(li.desenhar());
        IO.println(circ.desenhar());
        IO.println(ret.desenhar());
    }
}
