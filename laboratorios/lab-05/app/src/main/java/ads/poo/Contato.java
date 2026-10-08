package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;
    
    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public boolean addTelefone(String rotulo, String valor) {

        if (telefones.containsKey(rotulo)) {
            return false;
        }

        telefones.put(rotulo, new Telefone(valor));
        return true;
    }

    public boolean addEmail(String rotulo, String valor) {

        if (emails.containsKey(rotulo)) {
            return false;
        }

        emails.put(rotulo, new Email(valor));
        return true;
    }

    public boolean removeTelefone(String rotulo) {

        if (!(telefones.containsKey(rotulo))) {
            return false;
        }

        telefones.remove(rotulo);
        return true;
    }

    public boolean removeEmail(String rotulo) {

        if (!(emails.containsKey(rotulo))) {
            return false;
        }

        emails.remove(rotulo);
        return true;
    }

    public boolean updateTelefone(String rotulo, String valor) {

        if (!(telefones.containsKey(rotulo))) {
            return false;
        }

        Telefone telefone = telefones.get(rotulo);
        telefone.setValor(valor);
        return true;
    }

    public boolean updateEmail(String rotulo, String valor) {

        if (!(emails.containsKey(rotulo))) {
            return false;
        }

        Email email = emails.get(rotulo);
        email.setValor(valor);
        return true;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ").append(nome);
        sb.append("\nSobrenome: ").append(sobrenome);
        sb.append("\nData de Nascimento:").append(dataNasc);
        sb.append("\nTelefones: ").append(telefones);
        sb.append("\nEmails: ").append(emails);

        return sb.toString();
    }

}
