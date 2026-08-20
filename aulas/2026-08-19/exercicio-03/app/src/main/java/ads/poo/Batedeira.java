package ads.poo;

public class Batedeira {
    
    private String objetoParaBater;
    private String estado = "Desligado";
    private int velocidade = 3;

    public void atribuirObjetoParaBater(String objeto) {
        objetoParaBater = objeto;
    }

    public void pressionarBotaoDeLigar() {
        if (estado.equals("Desligado")) {
            estado = "Ligado";
        } else {
            estado = "Desligado";
        }
    }

    // Erro no incremento e decremento de velocidade, erroneamente aumento +2 em vez de +1

    public void incrementarVelocidade() {
        if (velocidade++ > 10) {
            velocidade = 10;
        } else {
            velocidade++;
        }
    }

    public void decrementarVelocidade() {
        if (velocidade-- < 1) {
            velocidade = 1;
        } else {
            velocidade--;
        }
    }

    public String obterObjetoParaBater() {
        return objetoParaBater;
    }

    public String obterEstadoBatedeira() {
        return estado;
    }

    public int obterVelocidade() {
        return velocidade;
    }
}
