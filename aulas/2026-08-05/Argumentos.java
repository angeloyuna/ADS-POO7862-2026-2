public class Argumentos {

    public static void main(String[] args) {
        
        if (args.length == 0) {
            IO.println("Sem argumentos");   
        } else {
            IO.println("Foram passados " + args.length + " argumentos: ");
            
            for (String aux : args) {
                IO.println(aux);    
            }
        }

        
    }
}