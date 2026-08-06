import java.util.Scanner;

public class Leitor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String linha;

        while (sc.hasNext()) {
            linha = sc.nextLine();
            IO.println(linha);
        }

        sc.close();
    }
}