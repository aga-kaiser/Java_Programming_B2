package day09_a_scanner;

import java.util.Scanner;

/*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

public class Angles {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // ask the user to enter 3 angle numbers
        System.out.println("Enter 3 angle numbers");
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();


        // for triangle ---> total degree of inner calculation is 180

        // Calculate what is the total of 3 numbers
        double total = angleOne + angleTwo + angleThree;

        boolean isTriangle = total == 180;
        boolean IsCircle = total == 360;

        // Write a print statement that print if it is triangle.
        System.out.println("It is triangle: " + (isTriangle));

        // Write a print statement that print if it is circle.
        System.out.println("It is circle: " + (IsCircle));

        // Write a print statement that print if it is EITHER triangle or Circle
        System.out.println("It is either triangle or circle: " + ( isTriangle || IsCircle));

    }
}
