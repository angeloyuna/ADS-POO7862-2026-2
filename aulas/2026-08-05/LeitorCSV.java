import java.util.Scanner;

public class LeitorCSV {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String linha, nome;
        double notaUm, notaDois, media;
        int mediaArredondada;

        while (sc.hasNext()) {
            linha = sc.nextLine();
            String[] campos = linha.split(",");

            nome = campos[0];
            notaUm = Double.parseDouble(campos[1]);
            notaDois = Double.parseDouble(campos[2]);

            media = (notaUm + notaDois) / 2;
            mediaArredondada = (int) Math.round(media);

            if (mediaArredondada >= 6) {
                IO.println(nome + ", com a média " + mediaArredondada + ", está aprovado.");
            } else {
                IO.println(nome + ", com a média " + mediaArredondada + ", está reprovado.");
            }
        }

        sc.close();
    }
}