package day03_comments_escape_sequence;

import java.util.function.ToDoubleBiFunction;

public class Comments {
    public static void main(String[] args) {

        // SINGLE LINE COMMENT - The next line is printing "Loopcamp"
        // I need to check Loopcamp later
        System.out.println("Loopcamp");

        /*
        MULTI LINE COMMENT
                  I can write in multiple lines
                  And it is still not going to be executed
         */

        /**
         *   This method is made by SDET tester
         *   ITS A JAVA DOCUMENTATION COMMENT
         *   ITS IN BRIGHT COLOR
         */
        System.out.println("Loopcamp is going on");

        //TODO: I need to fix this code later
        System.out.println("Change this code");
    }
}
