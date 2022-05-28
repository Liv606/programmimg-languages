package aula2;


public class Exemplo3 {
    public static void main(String[] args) {
        int[] banana = new int[10];
        for (int i = 0; i < banana.length; i++) {
            banana[i] = i + 5;
            
        }
        Exemplo2.imprimirVetor(banana);
        Exemplo2.imprimeVetorAoContrario(banana);
        int x = Exemplo4.somaVetor(banana);
        System.out.println("Soma = " + x);
    }
}
