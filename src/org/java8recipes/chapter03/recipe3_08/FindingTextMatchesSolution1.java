package org.java8recipes.chapter03.recipe3_08;

/**
 * Created by ÊAnita on 26/2/2017.
 */
public class FindingTextMatchesSolution1 {

    public static void main(String[] args) {

        String str = "Here is a long string ... let's find a match!";

        //This is will result in a "true" since it is an exact match
        boolean result = str.matches("Here is a long string ... let's find a match!");


        System.out.println(result);

        //This is will result in a "false" since since the entire string does not match
        result = str.matches("Here is a long string");

        System.out.println(result);

        str = "true";

        //this will test against both upper and lower case "T" ... this will be true

        result = str.matches("[Tt]rue");
        System.out.println(result);

        //This will test for one or the othres

        str = "false";
        result = str.matches("[Tt]rue|[Ff]alse");
        System.out.println(result);


        //This will test to see if any numbers are present , in this case
        // the Person writing this string would be able to like any java release!
        str = "I love Java 8!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);

        //This is will test true as well
        str = "I love Java 2!";
        result = str.matches("I love Java [0-9]!");
        System.out.println(result);


        //The following will test TRUE for any language that contains
        //only one word for the names. This is because it tests for any alphanumeric combination.
        //notice the space character between the numeric sequence ...

        result = str.matches("I love .*[0-9]!");
        System.out.println(result);

        //The following String also match
        str = "I love python 2!";
        result = str.matches("I love .*[0-9]!");
        System.out.println(result);


    }

}
