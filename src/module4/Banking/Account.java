package module4.Banking;

public class Account {

    long accountno;
    String name;
    float balance;

    Account(long accountno,String name,float balance)
    {
        this.accountno = accountno;
        this.name = name;
        this.balance = balance;
    }

    void deposit(float amt){
        this.balance = this.balance + amt;
        System.out.println("Rs" + amt + "Credited | Balance :" + this.balance);
    }

    void withDraw(float amt){
        if(this.balance>=amt){
            this.balance = this.balance - amt;
            System.out.println("Rs" + amt + "Debited| Balance :" + this.balance);
        }else
        {
            System.out.println("Account has insufficient Balance " + amt );
        }
    }

    void getBalance()
    {
        System.out.println("Current Account Balance for :" + this.accountno + "| " + this.name + "| "+ this.balance);
    }

}
