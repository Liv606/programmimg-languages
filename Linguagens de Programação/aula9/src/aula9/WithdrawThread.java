package aula9;

public class WithdrawThread extends TransThread {

    public WithdrawThread(Bank bank) {
        super(bank, "Withdraw", -250);
    }

}

