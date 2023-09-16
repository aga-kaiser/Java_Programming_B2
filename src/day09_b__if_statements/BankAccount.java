package day09_b__if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {


    //Create a Scanner object
    Scanner input = new Scanner(System.in);

        System.out.println("What is your balance? ");
    double balance = input.nextDouble();

        System.out.println("How much do you want to withdraw? ");
    double withdraw = input.nextDouble();

    balance -= withdraw;  //balance = balance - withdraw;

        if(balance < 0) {
        System.out.println("You took to much. " );
    } else {

        System.out.println("Your new balance is: " + balance);
    }

}
}