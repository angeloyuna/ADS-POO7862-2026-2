public class MediaDoisArgs {
    
    public static void main(String[] args) {
        
        /* Faça um programa que receba duas notas como argumentos de linha
            de comando e imprima na tela a média e a situação do aluno
            como aprovado (se média maior ou igual a 6) ou reprovado, caso
            contrário.  */

        double notaUm, notaDois, media;
        int mediaArredondada;

        if (args.length != 2) {
            throw new RuntimeException("Erro: É necessário inserir duas notas como argumentos");
        } else {
            notaUm = Double.parseDouble(args[0]);
            notaDois = Double.parseDouble(args[1]);

            media = (notaUm + notaDois) / 2;
            mediaArredondada = (int) Math.round(media);

            if (mediaArredondada >= 6) {
                IO.println("A sua média foi " + mediaArredondada + ", você está aprovado.");
            } else {
                IO.println("A sua média foi " + mediaArredondada + ", você está reprovado.");
            }
        }
    }
}