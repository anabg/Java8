package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 */
public class FindingTestMatchersWithPatterns
{
    public static void main(String[] args) {

        boolean b = Pattern.matches("a*b", "aaaaab");
        System.out.println(b);
    }
}
