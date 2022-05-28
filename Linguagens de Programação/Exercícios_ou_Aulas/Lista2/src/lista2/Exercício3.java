package lista2;

public class Exercício3 {

    public static boolean ehPar(int a) {
        boolean b = true;                      //ou só return (x%2 == 0);
        if (a % 2 != 0) {
            b = false;
        }
        return b;
    }

    public static void main(String[] args) {
        if (ehPar(20)) {        //se for true é impar e se for false é par
            System.out.println("É par!");
        } else {
            System.out.println("É impar!");
        }
    }

}
