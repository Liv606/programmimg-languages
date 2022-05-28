package lista2;

public class Exercício4 {

    public static double mediaAluno(double a, double b, double c) {
        return a * 0.3 + b * 0.3 + c * 0.4;
    }

    public static void main(String[] args) {
        double m = mediaAluno(7, 8, 10);
        System.out.println("Média = " + m);
    }

}
