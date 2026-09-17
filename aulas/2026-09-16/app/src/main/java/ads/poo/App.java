package ads.poo;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        // (chave, valor) mapeamento da chave para valor
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("123", "Juca");
        mapa.put("456", "Ana");
        mapa.put("789", "Pedro");
        mapa.put("789", "Paulo"); // Altera valor da chave 789 de Pedro para Paulo

        String nome = mapa.get("888");

        if (nome == null) {
            IO.println("Valor não encontrado.");
        } else {
            IO.println(nome);
        }

        // method forEach
        mapa.forEach((chave, valor) -> IO.println("Chave: " + chave + " | Valor: " + valor));
    
        // for each
        for (var elemento : mapa.entrySet()) {
            IO.println("Chave: " + elemento.getKey());
            IO.println("Valor: " + elemento.getValue());
        }

        mapa.remove("456"); // remoção pela chave
        mapa.values().removeIf(e -> e.equals("Juca")); // remove todos com valor Juca
    }
}