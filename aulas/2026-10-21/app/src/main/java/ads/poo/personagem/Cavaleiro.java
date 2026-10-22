package ads.poo.personagem;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(50, 3, 2);
    }

    @Override
    public String atacar() {
        return "* Cavaleiro está atacando com uma força de " + ataque;
    }

    @Override
    public String mover() {
        return "* Cavaleiro está se movendo a uma velocidade de " + velocidade;
    }
}
