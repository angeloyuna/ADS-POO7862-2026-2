public class MediaMultArgs {
    
    public static void main(String[] args) {
        
        /* Faça um programa que receba qualquer número de notas como 
            argumentos de linha de comando e imprima na tela a média 
            e a situação do aluno como aprovado (se média maior ou 
            igual a 6) ou reprovado, caso contrário.  */

        double nota;
        double media = 0;
        int mediaArredondada;

        if (args.length == 0) {
            throw new RuntimeException("Erro: É necessário inserir pelo menos uma nota como argumento");
        } else {
            for (String aux : args) {
                nota = Double.parseDouble(aux);
                media += nota;
            }

            media /= args.length;
            mediaArredondada = (int) Math.round(media);

            if (mediaArredondada >= 6) {
                IO.println("A sua média foi " + mediaArredondada + ", você está aprovado.");
            } else {
                IO.println("A sua média foi " + mediaArredondada + ", você está reprovado.");
            }
        }
    }
}