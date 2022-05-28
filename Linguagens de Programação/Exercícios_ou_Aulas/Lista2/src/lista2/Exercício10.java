package lista2;

public class Exercício10 {
    public static void questao10(int segundos){
        int horas = segundos/3600;
        segundos = segundos % 3600;
        int minutos = segundos/60;
        segundos = segundos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
    
    public static void main(String[] args) {
        questao10(5000);
    }
    
}
