package ads.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Associação do tipo Composição
        Aluno andy = new Aluno("Andy", "andy0123@gmail.com", new Endereco("Rua Trivial", "1223", "Bairro Trivial", "Cidade Trivial", "UF Trivial", "País Trivial", "CEP Trivial"));

        // Associação do tipo Composição
        Aviao aviaoTeste = new Aviao(2, 10, 500, "hélice", 4);
    
        // ERRO PARA INVESTIGAR: "this.motores" is null
        aviaoTeste.mudarInterruptorAviao();

    }
}
