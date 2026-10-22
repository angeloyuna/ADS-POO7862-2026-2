package ads.poo.personagem;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String atacar() {
        return "* Arqueiro está atacando com uma força de " + ataque;
    }

    @Override
    public String mover() {
        return "* Arqueiro está se movendo a uma velocidade de " + velocidade;
    }
}
