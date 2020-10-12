package module4.Banking;

import javax.swing.*;
import java.sql.SQLOutput;
import java.time.Clock;
import java.util.Scanner;

public class Banking {


    public static void main(String[] args) {
        Account acc = null;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Create an Account");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Balance");
            System.out.println("5. Exit the System");

            System.out.println("Enter an Option");
            int opt  = sc.nextInt();

            switch (opt){

                case 1:
                    if(acc==null){
                        System.out.println("Enter the account number");
                        long accountno = sc.nextLong();
                        sc.nextLine();

                        System.out.println("Enter the name");
                        String name  = sc.nextLine();

                        System.out.println("Enter the initial deposit");
                        float deposit  = sc.nextFloat();
                        /*create an object for account */
                       acc = new Account(accountno,name,deposit);
                        System.out.println("FYI : account is successfully created");

                    }
                    else{
                        System.out.println("Account is already created");
                    }
                    break;
                case 2:
                    if(acc!=null){
                        System.out.println("Enter the deposit amount");
                       float amt  = sc.nextFloat();
                       acc.deposit(amt);
                    }
                    else{
                        System.out.println("First create an account");
                    }
                    break;
                case 3:
                    if(acc!=null){
                        System.out.println("Enter the WithDraw amount");
                        float withDraw = sc.nextFloat();
                        acc.withDraw(withDraw);
                    }
                    else{
                        System.out.println("First create an account");
                    }
                    break;
                case 4:
                    if(acc!=null){
                        acc.getBalance();
                    }else{
                        System.out.println("First create an account");
                    }
                    break;
                case 5:
                    if(acc!=null){
                        System.out.println("***Bye Bye ****");
                        sc.close();
                        System.exit(0);
                    }
                default:
                    System.out.println("Enter option is an invalid ");
                    break;
            }
        }

    }

}
