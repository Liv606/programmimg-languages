package lista2;

public class Exercício1 {

    public static double media(int a, int b, int c, int d) {
        double m = ((double) (a + b + c + d)) / 4;
        return m;
    }

    public static void main(String[] args) {
        double m = media(4, 5, 6, 7);
        System.out.println("Média = " + m);
    }

}
