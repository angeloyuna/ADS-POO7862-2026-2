package ads.poo;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class Telefone {
    
    private String valor;

    public Telefone(String valor) {
        String eR = "^[0-9]+$";
        
        if (valor.matches(eR)) {
            this.valor = valor;
        }
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String formatar(String mascara, String valor) {
        MaskFormatter mask = null;
        String resultado = "";

        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Telefone: " + formatar("(##) #####-####", valor);
    }
}
