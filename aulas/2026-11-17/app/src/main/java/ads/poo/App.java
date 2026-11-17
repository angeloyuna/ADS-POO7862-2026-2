package ads.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

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
