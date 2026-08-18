package ads.poo;

public class Carro {
    
    // Atributos
    private int velocidadeAtual;

    // Métodos
    public void acelerar(int incremento) {
        if ((velocidadeAtual + incremento) > 100) {
            velocidadeAtual = 100;
        } else {
            velocidadeAtual += incremento;
        }
        
    }

    public int obterVelocidadeAtual() {
        return velocidadeAtual;
    }

}
