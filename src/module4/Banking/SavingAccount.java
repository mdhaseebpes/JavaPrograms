package module4.Banking;

public class SavingAccount extends  Account {
    SavingAccount(long accountno, String name, float balance) {
        super(accountno, name, balance);
    }

    void calculateInterestSavings()
    {

    }

    public static void main(String[] args) {
        SavingAccount sc = new SavingAccount(1000456,"AAA",12000);
        sc.deposit(2500);
        sc.getBalance();
        sc.withDraw(2000);
        sc.getBalance();
    }

}
