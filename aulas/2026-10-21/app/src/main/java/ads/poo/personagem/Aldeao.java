package ads.poo.personagem;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String atacar() {
        return "* Aldeão está atacando com uma força de " + ataque;
    }

    @Override
    public String mover() {
        return "* Aldeão está se movendo a uma velocidade de " + velocidade;
    }
}
