package ads.poo;

public class Personagem {
    
    private String nome;
    private int vida = 100;
    private int mana = 100;

    public void atribuirNome(String nomeAtribuido) {
        nome = nomeAtribuido;
    }

    public void tomarPoção() {
        vida += 50;
        mana += 10;
    }

    public void usarMagiaPoderModerado() {
        mana -= 25;
    }

    public void usarMagiaPoderAlto() {
        mana -= 50;
        vida -= 35;
    }

    public String obterNome() {
        return nome;
    }

    public int obterValorVida() {
        return vida;
    }

    public int obterValorMana() {
        return mana;
    }

}
