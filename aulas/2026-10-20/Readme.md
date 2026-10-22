# Exercícios de Herança

## Sistema Acadêmico

### Diagrama UML

```mermaid
classDiagram 
    direction LR

    class Pessoa {
        - int id
        - String nome
    }

    class Professor {
        - double salario
    }

    Pessoa <|-- Diretor
    Pessoa <|-- Professor
    Pessoa o-- MatriculaCurso
    
    MatriculaCurso o-- Curso
    Professor <|-- Coordenador
    Coordenador *-- Coordenadorias
```

## Sistema de Livraria

### Diagrama UML

```mermaid
classDiagram
    direction LR

    class Obra {
        - String titulo
        - LocalDate ano
        - int id
    }

    class Livro {
        - String isbn

    }

    class Periodicos {
        - String issn
    }

    class Gibi {
        - String ilustrador
    }

    class Revista {
        - String segmento
    }

    class Jornal {
        - String editor
    }

    Obra <|-- Livro
    Obra <|-- Periodicos

    Periodicos <|-- Gibi
    Periodicos <|-- Revista
    Periodicos <|-- Jornal
```

## Jogo de Transporte

### Diagrama UML

```mermaid
classDiagram
    direction LR

    class Veiculo {
        - int velocidadeAtual
        - int maxPassageiros
        - int capacidade
        + acelerar(v: int) void
        + frear(v: int) void 
    }

    class Terrestre {
        - ArrayList~String~ terrenosAcessiveis
    }

    class Carro {
        - String tipo
    }

    class Caminhao {
        - boolean basculanteAberta
    }

    class Aereo {
        - int maxAltitude
    }

    class Aquatico {
        - boolean podeDescerSuperficie
    }

    class Aviao {
        - String tipoDoMotor
        + ativarFlap(nivel: int)
    }

    class Barco {
        - boolean ancora
        + lancarAncora() boolean
    }

    Veiculo <|-- Terrestre
    Veiculo <|-- Aereo
    Veiculo <|-- Aquatico

    Terrestre <|-- Carro
    Terrestre <|-- Caminhao

    Aereo <|-- Aviao

    Aquatico <|-- Barco

```