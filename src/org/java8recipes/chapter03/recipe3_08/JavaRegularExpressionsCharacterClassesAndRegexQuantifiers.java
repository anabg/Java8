package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 *
 *
 * Regex Quantifiers
 *
 * The quantifiers specify the number of occurrences of a character.
 *
 * Regex	Description
 *
 * X?	X occurs once or not at all
 * X+	X occurs once or more times
 * X*	X occurs zero or more times
 * X{n}	X occurs n times only
 * X{n,}	X occurs n or more times
 * X{y,z}	X occurs at least y times but less than z times
 */
public class JavaRegularExpressionsCharacterClassesAndRegexQuantifiers {

    public static void main(String args[]) {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[amn]*", "ammma"));//true (a or m or n may come zero or more times)
        System.out.println(Pattern.matches("[a]{2}", "aa"));//true"a" occurs 2 times only
        System.out.println(Pattern.matches("[a]{4}", "aa"));//false "a" occurs 2 times not 4
        System.out.println(Pattern.matches("[a]{2,}", "aa"));//true "a" occurs 2 times only
        System.out.println(Pattern.matches("[a]{2,}", "aaaa"));//true "a" occurs 2 or more times
        System.out.println(Pattern.matches("[a]{2,8}", "aaaa"));// true "a" occurs at least 2 times but less than 8 times, occurs 6 times
        System.out.println(Pattern.matches("[a]{2,6}", "aaaaaaaa"));//false "a" occurs at least 2 times but more than 6 times, occurs 8 times

    }



}
