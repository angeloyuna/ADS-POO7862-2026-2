public class MediaTurma {

    public static void main(String[] args) {
        
        String buffer;
        int alunos;

        buffer = IO.readln("Entre com a quantidade de alunos: ");
        alunos = Integer.parseInt(buffer);

        double[][] notas = new double[alunos][3];
        double[] mediaSala = new double[3];

        for (int i = 0; i < alunos; i++) {
            buffer = IO.readln("Entre com a nota da A1 do Aluno " + (i + 1) + ": ");
            notas[i][0] = Double.parseDouble(buffer);

            buffer = IO.readln("Entre com a nota da A2 do Aluno " + (i + 1) + ": ");
            notas[i][1] = Double.parseDouble(buffer);

            notas[i][2] = Math.round((notas[i][0] + notas[i][1]) / 2);
        }

        // A maneira como eu coloquei espaços para formatar os prints não é muito eficaz e provalvemente pode ser melhorado com String.format

        IO.println("            A1          A2      Media");

        for (int i = 0; i < alunos; i++) {

            IO.print("Aluno " + (i + 1) + " ");

            for (int j = 0; j < 3; j++) {
                IO.print(String.format("    %.0f     ", notas[i][j]));
            }
        
            IO.println();
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < alunos; j++) {

                mediaSala[i] += notas[j][i];
            }

            mediaSala[i] /= alunos;
        }


        IO.println("Media " + String.format("      %.2f      ", mediaSala[0]) + String.format("%.2f      ", mediaSala[1]) + String.format("%.2f", mediaSala[2]));
    }
}