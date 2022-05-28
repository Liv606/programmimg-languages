package lista2;

public class Exercício17 {
    public static double mediaDiagonalPrincipal(int[][] m){
        
        double soma = 0;
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    soma += m[i][j];
                    c++;
                }
            }
        }
        return soma/c;
    }
    
    public static void main(String[] args) {
        
    }
    
}
