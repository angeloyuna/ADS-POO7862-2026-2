package ads.poo.disciplinas;

public class Disciplina {
    
    private String sigla;
    private DiaDaSemana[] dias;
    
    public Disciplina(String sigla, DiaDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    public String getSigla() {
        return sigla;
    }

    public DiaDaSemana[] getDias() {
        return dias;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(20));
        sb.append("\n* Sigla: ").append(sigla);
        sb.append("\n* Dias com aula: ");

        for (int i = 0; i < dias.length; i++) {
            sb.append("\n   - ").append(dias[i]);
        }

        return sb.toString();
    }
}