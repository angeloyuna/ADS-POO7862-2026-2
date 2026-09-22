package ads.poo;

import java.util.HashMap;

public class App {

    private static HashMap<String, Livro> livros = new HashMap<>();

    public static void main(String[] args) {

        IO.println("[1] - Cadastrar livro");
        IO.println("[2] - Listar todos os livros");
        IO.println("[3] - Consultar livro por ISBN");
        IO.println("[4] - Consultar livro por autor");
        IO.println("[5] - Consultar livro por ano de publicação");
        IO.println("[6] - Atualizar os dados do livro (Exceto ISBN)");
        IO.println("[7] - Remover um livro");
        IO.println("[8] - Sair do sistema");

        while (true) {
            int escolha = Integer.parseInt(IO.readln("--> Escolha uma opção: "));

            if (escolha == 1) {
                cadastrarLivro();
            } else if (escolha == 2) {
                listarLivros();
            } else if (escolha == 3) {
                consultarPorISBN();
            } else if (escolha == 4) {
                consultarPorAutor();
            } else if (escolha == 5) {
                consultarPorAno();
            } else if (escolha == 6) {
                atualizarDadosLivro();
            } else if (escolha == 7) {
                removerLivro();  
            } else if (escolha == 8) {
                sairDoSistema();
            } else {
                IO.println("!!! Escolha inválida");
            }
        }
    }

    public static void cadastrarLivro() {
        String isbn = IO.readln("> Entre com o número ISBN do lívro: ");

        if (livros.get(isbn) == null) {

            String titulo = IO.readln("> Entre com o título do lívro: ");
            String autor = IO.readln("> Entre com o nome do autor do lívro: ");    
            int ano = Integer.parseInt(IO.readln("> Entre com o ano de publicação do lívro: "));

            livros.put(isbn , new Livro(isbn, titulo, autor, ano));

        } else {
            IO.println("!!! Valor ISBN já utilizado.");
        }
    }

    public static void listarLivros() {

        livros.forEach((isbn, livro) -> {
            IO.println("ISBN: " + isbn + " | Título: " + livro.getTitulo());
        });
    }

    public static void consultarPorISBN() {
        
        String isbnConsultado = IO.readln("> Entre com o ISBN para consultar: ");
        Livro livroConsultado = livros.get(isbnConsultado);

        if (livroConsultado != null) {
            IO.print(livroConsultado.toString());
        } else {
            IO.println("!!! ISBN consultado não se refere a um livro");
        }
    }

    public static void consultarPorAutor() {

        String autorConsultado = IO.readln("> Entre com o nome do autor para consultar: ");

        livros.forEach((isbn, livro) -> {
            String autor = livro.getAutor();

            if (autor.equals(autorConsultado)) {
                IO.println("ISBN: " + isbn + " | Título: " + livro.getTitulo());
            } 

        });    
    }

    public static void consultarPorAno() {

        int anoConsultado = Integer.parseInt(IO.readln("> Entre com o ano de publicação para consultar: "));
    
        livros.forEach((isbn, livro) -> {
            Integer ano = livro.getAno();

            if (ano.equals(anoConsultado)) {
                IO.println("ISBN: " + isbn + " | Título: " + livro.getTitulo());
            } 
            
        });
    }

    public static void atualizarDadosLivro() {

        String isbnConsultado = IO.readln("> Entre com o ISBN do livro para editar os seus dados: ");
        Livro livroConsultado = livros.get(isbnConsultado); 
        String buffer;

        if (livroConsultado != null) {

            IO.println("---> Entre nada para não atualizar uma informação <---");
            
            buffer = IO.readln("> Entre com o novo nome para o livro (Atual: " + livroConsultado.getTitulo() + "): ");
            
            if (!(buffer.equals(""))) {
                livroConsultado.setTitulo(buffer);
            }

            buffer = IO.readln("> Entre com o novo autor do livro (Atual: " + livroConsultado.getAutor() + "): ");

            if (!(buffer.equals(""))) {
                livroConsultado.setAutor(buffer);
            }

            buffer = IO.readln("> Entre com o novo ano de publicação do livro (Atual: " + livroConsultado.getAno() + "): ");

            if (!(buffer.equals(""))) {
                livroConsultado.setAno(Integer.parseInt(buffer));
            }

        } else {
            IO.println("!!! ISBN consultado não se refere a um livro");
        }
    }

    public static void removerLivro() {

        String isbnParaRemover = IO.readln("> Entre com o ISBN do livro que você gostaria de remover: ");
        Livro livroConsultado = livros.get(isbnParaRemover);

        if (livroConsultado != null) {
            livros.remove(isbnParaRemover);
            IO.println("* Livro removido");
        } else {
            IO.println("!!! ISBN utilizado não se refere a um livro");
        }

    }

    public static void sairDoSistema() {
        System.exit(0);
    }
}