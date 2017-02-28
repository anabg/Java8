package org.java8recipes.chapter03.recipe3_06;

/**
 * Created by ÊAnita on 26/2/2017.
 */
public class ConvertingStringToNumericValuesSolution1 {

    public static void main(String[] args) {

        String one = "1";
        String two = "2";
        int result = Integer.valueOf(one) + Integer.valueOf(two);

        System.out.println(one);
        System.out.println(two);
        System.out.println(result);

    }
}
