package aula2;


public class Exemplo4 {
    public static int somaVetor(int[] v){
        int soma = 0;
        
        for (int i = 0; i < v.length; i++) {
            soma += v[i];            
        }
        return soma;
    }
}
