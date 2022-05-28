package lista2;

public class Exercício9 {
    
    public static int calcularDelta(int a, int b, int c){
        int x = 0;
        int y = 0;
        int d = (int)(Math.pow(b, 2) - 4*a*c);
        if (d>0) {
            x = (int)((-b + Math.sqrt(d))/2*a);
            y = (int)((-b - Math.sqrt(d))/2*a);
        }else if(d==0){
            
        }
    }
    
}
