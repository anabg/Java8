package org.java8recipes.chapter03.recipe3_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 */
public class ReplacingAllTextMatching {
    public static void main(String[] args) {

        String str = "I love Java 8! It is my favorite language. Java 8 is the 8th version of this great programing language ";
        boolean result = false;

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(str);

        System.out.println("original " + str);
        result = matcher.matches();

        System.out.println(result);

        System.out.println("Replacement " + matcher.replaceAll("2"));

    }


}
