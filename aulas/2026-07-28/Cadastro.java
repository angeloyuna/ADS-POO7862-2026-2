void main() {
    String buffer;
    char sexo;
    int idade;

    sexo = IO.readln("Entre com o seu sexo (M/F): ").toUpperCase().charAt(0);
    
    buffer = IO.readln("Entre com a sua idade: ");
    idade = Integer.parseInt(buffer);

    if (idade >= 18 && sexo == 'M') {
        IO.println("É necessário você apresentar atestado de reservista.");
    } else {
        IO.println("Não é necessário você apresentar atestado de reservista.");
    }
}