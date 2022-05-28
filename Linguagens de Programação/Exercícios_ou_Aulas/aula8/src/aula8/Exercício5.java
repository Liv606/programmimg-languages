package aula8;

import static java.lang.System.out;
import java.time.Duration;
import java.time.Instant;

public class Exercício5 {

    public static long fatorialRecursivo(long f) {
        if (f == 0) {
            return 1;
        } else {
            return (f * fatorialRecursivo(f - 1));
        }
    }

    public static long fatorialIterativo(long f) {
        long i, aux;
        aux = f;
        if (f == 0) {
            return 1;
        } else {
            for (i = f - 1; i > 0; i--) {
                aux = aux * i;
            }
            return aux;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            long ini = System.nanoTime();
            long fat = fatorialIterativo(i);
            long fim = System.nanoTime();
            long periodo = fim - ini;
            System.out.println("FatIter(" + i + ")=" + fat + "\t tempo: " + (periodo));

            ini = System.nanoTime();
            fat = fatorialRecursivo(i);
            fim = System.nanoTime();
            periodo = fim - ini;
            System.out.println("FatRec(" + i + ")=" + fat + "\t tempo: " + (periodo));

        }
    }

}
