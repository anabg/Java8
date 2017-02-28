package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 26/2/2017.
 * <p>
 * User regular expressions Pattern and Matcher classes
 */
public class FindingTextMatchesSolution2 {

    public static void main(String[] args) {

        String str = "I love Java 8!";
        boolean result = false;

        Pattern pattern = Pattern.compile("I love .*[0-9]!");
        Matcher matcher = pattern.matcher(str);
        result = matcher.matches();

        System.out.println(result);
    }
}
