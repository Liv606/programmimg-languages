package aula9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Baleia extends Animal implements Aquatico,Runnable {
    
    public Baleia(String especie) {
        super(especie);
    }

    @Override
    public void nadar() {
        System.out.println("Baleia " + getEspecie() + " nadando... ~splish splash~");
    }

    @Override
    public void run() {
        while (true) { 
            nadar();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    
    
    
}
