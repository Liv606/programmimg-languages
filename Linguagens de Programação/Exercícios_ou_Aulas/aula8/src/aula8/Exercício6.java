package aula8;


public class Exercício6 {

    public static long fiboRec(int n) {
        if (n < 2) {
            return n;
        } else {
            return fiboRec(n - 1) + fiboRec(n - 2);
        }
    }

    public static long fiboIter(int n) {
        long atu = 0;
        long ant = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atu = 1;
                ant = 0;
            } else {
                atu += ant;
                ant = atu - ant;
            }
        }
        return atu;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            long ini = System.nanoTime();
            long fat = fiboIter(i);
            long fim = System.nanoTime();
            long periodo = fim - ini;
            System.out.println("FIter(" + i + ")=" + fat + "\t tempo: " + (periodo));
            
            ini = System.nanoTime();
            fat = fiboRec(i);
            fim = System.nanoTime();
            periodo = fim - ini;
            System.out.println("FiboRec(" + i + ")=" + fat + "\t tempo: " + (periodo));

        }
    }

}
