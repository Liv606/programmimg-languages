package lista2;

public class Exercício6 {
    public static int calcularFatorial(int a){
        int f = a;
        for (int i = a-1; i >= 1; i--) {
            f = f*i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        int f = calcularFatorial(3);
        System.out.println("O fatorial é: " + f);
    }
    
}
