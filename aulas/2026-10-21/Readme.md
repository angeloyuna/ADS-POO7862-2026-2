# Jogo Java of Empires

## Diagrama UML

```mermaid
classDiagram
    direction TB

    class Personagem {
        - int vida
        - int ataque
        - int velocidade
        + mover() String
    }

    class Coletor {
        + coletarMadeira() String
        + coletarOuro() String
    }

    class Guerreiro {
        + atacar() String
    }

    Personagem <|-- Aldeao
    Personagem <|-- Arqueiro
    Personagem <|-- Cavaleiro

    Coletor <|.. Aldeao
    
    Guerreiro <|.. Aldeao
    Guerreiro <|.. Arqueiro
    Guerreiro <|.. Cavaleiro
```
