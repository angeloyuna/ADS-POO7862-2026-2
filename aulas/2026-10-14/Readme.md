# Herança

- <b>Dica:</b> Se Classe 2 é um(a) Classe 1, então faz sentido Classe 2 herder da Classe 1
- Deixar um atributo `protected` possibilita o uso do atributo ser usado em diferentes classes que herdam dessa classe com o atributo

## Sistema para Cadastro de Produtos

### Diagrama UML


```mermaid
classDiagram
    direction BT

    class Produto {
        - int codigo
        - String numSerie
        # String modelo
        - double peso
        + Produto()
    }

    class Telefone {
        - String modoDeDiscagem
        + Telefone()
    }

    class Pager {
        - int numLinhasDisplay
        + Pager()
    }

    class SemFio {
        - double frequencia
        - int canais
        - double distanciaOperacao
        + SemFio()
    }

    Telefone --|> Produto
    SemFio --|> Telefone
    Pager --|> Produto
```