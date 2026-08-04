public class LerMatriz {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[2][3]; // linha coluna

        matriz[0][0] = 10;
        matriz[0][1] = 5;
        matriz[0][2] = 40;
        matriz[1][0] = 20;
        matriz[1][1] = 25;
        matriz[1][2] = 50;

        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
                IO.print(String.format("%d ", matriz[i][j]));
            }

            IO.println();
        }
    }
}