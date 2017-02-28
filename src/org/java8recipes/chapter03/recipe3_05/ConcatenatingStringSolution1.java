package org.java8recipes.chapter03.recipe3_05;

/**
 * Created by ÊAnita on 26/2/2017.
 */
public class ConcatenatingStringSolution1 {

    public static void main(String[] args) {

        String one = "Hello";
        String two = "Java8";

        /*
        * Two strings are concatenated
        * */
        String result = one.concat(" ".concat(two));

        //The variable one was not modified in the concat method, String variables are inmutable
        System.out.println(one);
        System.out.println(two);
        System.out.println(result);

        String result2 = one.concat(" ".concat(two.substring(0, two.length() - 1)));

        System.out.println(result2);

    }
}
