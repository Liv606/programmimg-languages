package aula9;

public class TestaBaleia {
    
    public static void main(String[] args) {
        Baleia azul = new Baleia("Azul");
        Baleia cachalote = new Baleia("Cachalote");
        Thread t = new Thread(azul);
        t.start();
        Thread t2 = new Thread(cachalote);
        t2.start();
    }
    
}
