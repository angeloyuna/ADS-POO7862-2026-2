package ads.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        /*

        ArrayList<String> lista = new ArrayList<>();

        lista.add("POO");
        lista.add("ADS");
        lista.add("IFSC");
        lista.add(1, "SJE");

        lista.removeIf(e -> e.equals("ADS"));


        IO.println(lista);

        // for i 
        for (int i = 0; i < lista.size(); i++) {
            IO.println(lista.get(i));
        }

        // for each
        for (String e : lista) {
            IO.println(e);
        }

        // lambda
        lista.forEach(e -> IO.println(e));

        // method reference
        lista.forEach(IO::println);

         */

        ArrayList<Pessoa> agenda = new ArrayList<>();

        agenda.add(new Pessoa("Juca", "juca@example.org"));
        agenda.add(new Pessoa("Ana", "ana@example.org"));
        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
        agenda.add(new Pessoa("Juca", "juca@example.com"));

        // Remova todas as pessoas com o nome Juca
        agenda.removeIf(p -> p.getNome().equals("Juca"));

        agenda.forEach(IO::println);
    }
}