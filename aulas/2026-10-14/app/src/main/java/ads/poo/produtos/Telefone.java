package ads.poo.produtos;

public class Telefone extends Produto {
    
    private String modoDeDiscagem;

    public Telefone(int codigo, String numSerie, String modelo, double peso, String modoDeDiscagem) {
        super(codigo, numSerie, modelo, peso);
        this.modoDeDiscagem = modoDeDiscagem;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.toString().replace("Produto", "Telefone"));
        sb.append("\n* Modo de discagem: ").append(modoDeDiscagem);

        return sb.toString();
    }
}
