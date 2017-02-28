package org.java8recipes.chapter03.recipe3_05;

/**
 * Created by �Anita on 26/2/2017.
 */
public class ConcatenatingStringSolution2 {

    public static void main(String[] args) {

        String one = "Hello";
        String two = "Java8";

        /*
        * Two strings are concatenated
        * */
        String result = one + " " + two;

        //The variable one was not modified in the concat method, String variables are inmutable
        System.out.println(one);
        System.out.println(two);
        System.out.println(result);

    }
}
