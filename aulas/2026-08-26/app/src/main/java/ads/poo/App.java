package ads.poo;

public class App {

    private Pessoa[] banco = new Pessoa[100];

    public void menu() {

        while (true) {
         
            String msg = """
                    1 - Cadastrar
                    2 - Listar todas pessoas
                    3 - Imprimir dados de uma pessoa
                    4 - Sair """;

            IO.println(msg);
            int escolha = Integer.parseInt(IO.readln("Entre com uma opção: "));
   
            switch (escolha) {
                case 1 -> this.cadastrar();
                case 2 -> this.listarTodasPessoas();
                case 3 -> this.imprimirDadosUmaPessoa();
                case 4 -> System.exit(0);
                default -> IO.println("!!! Erro: Opção inválida");
            }
        }
    }


    public void cadastrar() {

        String nome = IO.readln("Entre com um nome: ");
        String email = IO.readln("Entre com um email: ");
        int pessoasRegistradas = Pessoa.getPessoasRegistradas();

        banco[pessoasRegistradas] = new Pessoa(nome, email);

    }

    public void listarTodasPessoas() {

        String tabelaPessoas, nome;
        int id;

        IO.println("-".repeat(25));
        IO.println(String.format("| %5s | %10s |", "ID", "Nome"));

        for (int i = 0; i < banco.length; i++) {

            if (banco[i] == null) {
                break;
            } else {
                id = banco[i].getId();
                nome = banco[i].getNome();

                tabelaPessoas = String.format("| %5d | %10s |", id, nome);
                IO.println(tabelaPessoas); 
            }
        }

        IO.println("-".repeat(25));
    }

    public void imprimirDadosUmaPessoa() {

        String buffer = IO.readln("Entre com o ID da pessoa: ");
        int escolhaId = Integer.parseInt(buffer) - 1;

        IO.println("-".repeat(25));
        IO.println(banco[escolhaId].toString());
        IO.println("-".repeat(25));

    }

    public static void main(String[] args) {

        App app = new App();

        app.menu();
        
    }
}