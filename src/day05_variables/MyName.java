package day05_variables;

public class MyName {
     /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */

    public static void main(String[] args) {

        char firstLetter = 'A';
        char secondLetter = 'g';
        char thirdLetter = 'n';
        char fourthLetter = 'i';
        char fifthLetter = 'e';
        char sixthLetter = 's';
        char seventhLetter = 'z';
        char eightLetter = 'k';
        char ninthLetter = 'a';

        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);
        System.out.println(fourthLetter);
        System.out.println(fifthLetter);
        System.out.println(sixthLetter);
        System.out.println(seventhLetter);
        System.out.println(eightLetter);
        System.out.println(ninthLetter);

        System.out.println(firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter + sixthLetter + seventhLetter + eightLetter + ninthLetter);
        System.out.println("My name is: " + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter + sixthLetter + seventhLetter + eightLetter + ninthLetter);

        String myName = "" + firstLetter + secondLetter + thirdLetter + fourthLetter + fifthLetter + sixthLetter + seventhLetter + eightLetter + ninthLetter;
        System.out.println("My name is: " + myName);



    }

}

