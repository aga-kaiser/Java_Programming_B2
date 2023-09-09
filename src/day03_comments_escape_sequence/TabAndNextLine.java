package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        // The followings are about \t - tab
        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbed 1 time");  // This is tabbed 1 time
        System.out.println("    This is not tabbed");   // 4 space is 1 tab
        System.out.println("\t\tThis is tabbed 2 time"); // This is tabbed 2 times

        // The following are about \n  - new line
        System.out.println("1) Go to the store");
        System.out.println("2) Grab milk");
        System.out.println("3) Pay cashier");

        System.out.println("\n1) Go to the store\n2) Grab milk\n3) Pay cashier");




    }
}
