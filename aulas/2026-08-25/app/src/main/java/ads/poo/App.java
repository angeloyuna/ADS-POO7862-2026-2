package ads.poo;

public class App {

    public static void main(String[] args) {

        Caneta a = new Caneta("azul", 100);
        Caneta b = new Caneta(50); // azul, 50
        Caneta c = new Caneta(); // azul, 100

        // Cor: azul
        // Tinta: 100%

        IO.println(a.toString());

    }
}