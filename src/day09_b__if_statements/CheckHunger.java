package day09_b__if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {


        //Create a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Are you hungry (true or false): ");
        boolean isHungry = input.nextBoolean();

        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you");
        } else {
            System.out.println("Great, then go practice Java");
        }

    }
}

