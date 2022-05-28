package lista2;

public class Exercício2 {

    public static int maior(int a, int b, int c) {
        int m = 0;
        if (a > b && a > c) {
            m = a;
        } else if (b > a && b > c) {
            m = b;
        } else {
            m = c;
        }
        return m;
    }

    public static void main(String[] args) {
        int m = maior(67, 18, 10);
        System.out.println(m);
    }

}
