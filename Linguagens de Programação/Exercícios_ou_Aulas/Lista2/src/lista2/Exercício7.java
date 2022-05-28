package lista2;

public class Exercício7 {

    public static double raioEsfera(double r) {
        double v = (4 * Math.PI * Math.pow(r, 3)) / 3;
        return v;
    }

    public static void main(String[] args) {

        double v = raioEsfera(2);
        System.out.println("O volume da esfera é: " + v);

    }

}
