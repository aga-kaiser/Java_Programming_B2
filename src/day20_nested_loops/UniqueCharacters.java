package day20_nested_loops;
/* Task:
         Given a String, find and print the unique characters.
         A character is unique if it only appears once in the String.

         Ex:AAABCCDEEF
         Output:BDF

 */
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AABXXDEEF"; // BDF
        String uniques = "";

        for (int i = 0; i < str.length(); i++) {

            char eachOuterLetter = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {

                char eachInnerLetter = str.charAt(j);

                if (eachOuterLetter == eachInnerLetter) {
                    count++;
                }

            }

            if (count == 1) { // This condition check if the letter is in the String ONLY 1 time. If, TRUE, add it into the new String container called 'uniques'
                uniques += ("" + eachOuterLetter); // uniques = uniques + ("" + eachOuterLetter);
            }

        }

        System.out.println(uniques);

    }
}
