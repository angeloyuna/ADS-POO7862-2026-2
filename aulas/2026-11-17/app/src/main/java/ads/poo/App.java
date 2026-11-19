package ads.poo;

import ads.poo.disciplinas.*;
import edu.princeton.cs.algs4.Draw;
import ads.poo.baralho.*;
import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        /* Exercício: Disciplinas

        ArrayList<Disciplina> disciplinas = new ArrayList<>(); 
        
        Disciplina poo = new Disciplina("POO", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.QUARTA});
        Disciplina fei = new Disciplina("FEI", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.SEXTA});        
        Disciplina rco = new Disciplina("RCO", new DiaDaSemana[]{DiaDaSemana.SEGUNDA, DiaDaSemana.QUINTA});

        disciplinas.add(poo);
        disciplinas.add(fei);
        disciplinas.add(rco);

        for (int i = 0; i < disciplinas.size(); i++) {

            boolean presenteTerca = false;
            DiaDaSemana[] diasDaSemana = disciplinas.get(i).getDias();

            for (int j = 0; j < diasDaSemana.length; j++) {
                
                if (diasDaSemana[j].equals(DiaDaSemana.TERCA)) {
                    presenteTerca = true;
                }
            }

            if (presenteTerca) {
                IO.println(disciplinas.get(i));
            }
        }

        */

        /* Exercício: Baralho Francês */

        ArrayList<Carta> baralho = new ArrayList<>();

        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                baralho.add(new Carta(v, n));
                Collections.shuffle(baralho);
            }
        }

        IO.println(baralho);

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setXscale(0, 800);
        draw.setYscale(0, 800);

        CartaGrafica c = new CartaGrafica(Valor.DAMA, Naipe.PAUS, 400, 400);
        c.desenhar(draw);

        /* Teoria

        DiaDaSemana d = DiaDaSemana.DOMINGO;

        if (d.equals(DiaDaSemana.QUARTA)) {} // d ==

        switch (d) {
            case TERCA -> {}
        }
        
        for (DiaDaSemana e : DiaDaSemana.values()) { // Percorrendo a coleção
            IO.println(e);
        }

        */
    }
}
