package aula9;

public class Bank {

    private String transName;
    private double total;
    private double transactionValue;

    synchronized void update(String transName, double amount) {
        this.transName = transName;
        this.transactionValue = amount;
        for (int i = 0; i < Math.abs(transactionValue); i++) {
            this.total += Math.signum(amount);
        }
        System.out.println(this.transName + " " + amount + " total = " + total);
    }
}


