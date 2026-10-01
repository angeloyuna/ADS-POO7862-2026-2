package ads.poo;

public class Motor {
    
    private String tipo;
    private boolean status;
    
    public Motor(String tipo) {
        this.tipo = tipo;
        this.status = false;
    }

    public void ligarMotor() {
        this.status = true;
        IO.println("Motor ligado.");
    }
    
    public void desligarMotor() {
        this.status = false;
        IO.println("Motor desligado");
    }
}
