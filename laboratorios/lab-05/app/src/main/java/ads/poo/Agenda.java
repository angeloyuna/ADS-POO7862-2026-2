package ads.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public boolean addContato(Contato c) {

        contatos.add(c);
        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobreNome) {

        ArrayList<Contato> contatosAchados = new ArrayList<>();

        for (Contato contato : contatos) {
            
            if (contato.getNome().equals(nome) && contato.getSobrenome().equals(sobreNome)) {
                contatosAchados.add(contato);
            }
        }

        return contatosAchados;
    }

    public boolean removeContato(int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            contatos.remove(indiceContatoNaLista);
            return true;
        }
    }
    
    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.addTelefone(rotulo, valor);
            return true;
        }
    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        }  else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.addEmail(rotulo, valor);
            return true;
        }
    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.updateTelefone(rotulo, valor);
            return true;
        }
    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.updateEmail(rotulo, valor);
            return true;
        }
    }

    public boolean removeTelefone(String rotulo, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.removeTelefone(rotulo);
            return true;
        }
    }    

    public boolean removeEmail(String rotulo, int indiceContatoNaLista) {

        if (contatos.get(indiceContatoNaLista) == null) {
            return false;
        } else {
            Contato contato = contatos.get(indiceContatoNaLista);
            contato.removeEmail(rotulo);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Agenda: " + contatos;
    }
}
