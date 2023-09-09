package day03_comments_escape_sequence;

public class Quote {
    public static void main(String[] args) {

        /*

           Q: How can I output the following

           I like "Java" programing

         */
        //                  I like "Java" programing
        System.out.println("I like \"Java\" programming");

        // Single quote is also used as part of the Java Syntax as well
        System.out.println("I likek 'Java' programming");

        // How can i print backward slash?
        System.out.println("I like \\Java\\ programming");

        // How can I print 2 backward slash
        System.out.println("I like \\\\Java\\\\ programming");
    }
}
