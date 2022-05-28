package aula9;

public class SynchronizationDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();
        TransThread tt1 = new DepositThread(bank);
        TransThread tt2 = new WithdrawThread(bank);
        tt1.start();
        tt2.start();
    }

}


