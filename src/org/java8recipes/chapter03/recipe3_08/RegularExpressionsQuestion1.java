package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 28/2/2017.
 */
/*Create a regular expression that accepts alpha numeric characters only. Its
length must be 6 characters long only.*/
public class RegularExpressionsQuestion1 {

    public static void main(String args[]) {

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "anabe2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "anabelen2"));//false
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
    }
}
