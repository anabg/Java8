package org.java8recipes.chapter03.recipe3_05;

/**
 * CONCATENATING STRINGS
 *
 * Problem: There are various strings that you want to combine into one.
 *
 * Solution #1: If you want to concatenate strings onto the end of each other, use the concat() method. The following example
 * demonstrates the use of the concat() method:
 *
 * String one = "Hello";
 * String two = "Java8";
 *
 * String result = one.concat(" ".concat(two));
 *
 * The result is this:
 *
 * Hello Java8
 *
 *
 * Created by ÊBelua on 26/2/2017.
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
