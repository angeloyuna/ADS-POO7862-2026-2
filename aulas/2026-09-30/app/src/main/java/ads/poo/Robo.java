package ads.poo;

public class Robo {
    
    private int[] dimensaoMapa = new int[2];
    private Coordenada coordenadas;
    private int consumoPorUnidade;
    private Bateria bateria;
    
    public Robo(int[] dimensaoMapa, Coordenada coordenadas, int consumoPorUnidade, Bateria bateria) {
        this.dimensaoMapa = dimensaoMapa;
        this.coordenadas = coordenadas;
        this.consumoPorUnidade = consumoPorUnidade;
        this.bateria = bateria;
    }

    public void moverRobo(String direcao, int unidades) {

        // Verificar bateria antes de mover

        switch (direcao) {
            case "N" -> dimensaoMapa[1] += unidades;
            case "S" -> dimensaoMapa[1] -= unidades;
            case "L" -> dimensaoMapa[0] += unidades;
            case "O" -> dimensaoMapa[0] -= unidades;
        }
    }
}
