package ads.poo;

import ads.poo.produtos.Produto;
import ads.poo.produtos.Pager;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class App {

    public static void main(String[] args) {

        Produto pro = new Produto(5, "Zero", "Zero", 123);
        Telefone tel = new Telefone(100, "Um", "A2", 10, "disco");
        SemFio sf = new SemFio(120, "Dois", "2B", 12, "botao", 50, 11, 3);
        Pager pg = new Pager(99, "Três", "2E", 8, 100);

        IO.println(pro.toString());
        IO.println(tel.toString());
        IO.println(sf.toString());
        IO.println(pg.toString());
        
    }
}
