package aula9;

public class DepositThread extends TransThread {

    public DepositThread(Bank bank) {
        super(bank, "Deposit", +250);
    }

}

