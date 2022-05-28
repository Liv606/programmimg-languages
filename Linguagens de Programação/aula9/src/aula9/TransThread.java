package aula9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TransThread extends Thread {

    private Bank bank;
    private String name;
    private double amount;

    public TransThread(Bank bank, String name, double amount) {
        super(name);
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            bank.update(name, amount);
            int n = ((int)(Math.random()*(100))) + 1;
            try {
                Thread.sleep(n);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
}

