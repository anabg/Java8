package org.java8recipes.chapter03.recipe3_08;

import java.util.regex.Pattern;

/**
 * Created by ÊAnita on 27/2/2017.
 * <p>
 * The . (dot) represents a single character.
 */
public class JavaRegularExpressionSingleCharacter {

    public static void main(String args[]) {
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
    }
}
