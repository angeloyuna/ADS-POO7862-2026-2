package ads.poo;

public class Pessoa {

    // pessoasRegistradas é estático, logo é atributo da classe
    private static int pessoasRegistradas = 0;

    private int id;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        pessoasRegistradas++;
        id = pessoasRegistradas; 
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    public static int getPessoasRegistradas() {
        return pessoasRegistradas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("ID: ").append(id);
        sb.append("\nNome: ").append(nome);
        sb.append("\nEmail: ").append(email);

        return sb.toString();
    }
}