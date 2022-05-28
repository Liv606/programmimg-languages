package lista2;

import java.util.Scanner;

public class Exercício5 {

    public static double areaTrapezio(double a, double b, double c) {
        double t = ((a + b) * c) / 2;
        return t;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a base maior: ");
        a = leitura.nextDouble();
        System.out.print("Digite a base menor: ");
        b = leitura.nextDouble();
        
        while(b>a){
            System.out.println("A base menor não pode ser maior que a base maior");
            System.out.print("Digite a base menor: ");
            b = leitura.nextDouble();
        }
        
        System.out.print("Digite a altura: ");
        c = leitura.nextDouble();
        double t = areaTrapezio(a, b, c);
        System.out.println("A área é: " + t);
    }
    

}
