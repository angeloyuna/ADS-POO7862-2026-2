package ads.poo;

import java.util.ArrayList;

public class Aviao {
    
    private int maxTripulantes;
    private int maxPassageiros;
    private int maxCombustivel;
    private boolean status;
    private String tipoMotor;
    private int totalMotores;
    private ArrayList<Motor> motores;
    
    public Aviao(int maxTripulantes, int maxPassageiros, int maxCombustivel, String tipoMotor, int totalMotores) {
        this.maxTripulantes = maxTripulantes;
        this.maxPassageiros = maxPassageiros;
        this.maxCombustivel = maxCombustivel;
        this.status = false;

        ArrayList<Motor> motores = new ArrayList<>();

        for (int i = 0; i < totalMotores; i++) {
            motores.add(new Motor(tipoMotor));
        }
    }
 
    public void mudarInterruptorAviao() {
        
        if (this.status = false) {
            this.status = true;
        
            for (Motor motor : this.motores) {
                motor.ligarMotor();
            }

            IO.println("Avião ligado.");
        } else { 
            this.status = false;

            for (Motor motor : this.motores) {
                motor.desligarMotor();
            }

            IO.println("Avião desligado");
        }
    }
}
