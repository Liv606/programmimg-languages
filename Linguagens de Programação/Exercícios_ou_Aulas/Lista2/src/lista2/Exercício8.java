package lista2;

public class Exercício8 {

    public static boolean ehPrimo(int a) {
        if(a == 0 || a == 1){
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if (ehPrimo(10)) {
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
    }

}
