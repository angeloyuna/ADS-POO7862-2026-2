
package ads.poo;

import ads.poo.personagem.Aldeao;
import ads.poo.personagem.Arqueiro;
import ads.poo.personagem.Cavaleiro;

public class App {

    public static void main(String[] args) {

        Aldeao ald = new Aldeao();
        Arqueiro arq = new Arqueiro();
        Cavaleiro cav = new Cavaleiro();

        IO.println(ald.mover());
        IO.println(arq.atacar());
        IO.println(cav.mover());
        IO.println(cav.atacar());
    }
}
