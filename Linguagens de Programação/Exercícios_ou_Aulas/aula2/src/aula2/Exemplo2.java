package aula2;


public class Exemplo2 {
    public static void imprimirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
            
        }
        System.out.println("");
    }
    
    public static void imprimeVetorAoContrario(int[] v){
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + "\t");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] banana = new int[10];
        for (int i = 0; i < banana.length; i++) {
            banana[i] = i + 5;
            
        }
        imprimirVetor(banana);
        imprimeVetorAoContrario(banana);
    }
    
}
