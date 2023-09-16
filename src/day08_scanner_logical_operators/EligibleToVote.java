package day08_scanner_logical_operators;

public class EligibleToVote {

     /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote,
     1) they can only vote if they are a citizen,
      AND
     2) have no criminal background
      AND
     3) are about age 18

    print : $name is eligible to vote: $boolean

      */

    public static void main(String[] args) {


        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isNotCriminal = false;
        int age = 30;

        boolean isEligible;

        isEligible = isCitizen && isNotCriminal && age >= 18;
        //             true         false         true
        //
        //
        System.out.println(name + " is eligible to vote " + isEligible);



    }
}
