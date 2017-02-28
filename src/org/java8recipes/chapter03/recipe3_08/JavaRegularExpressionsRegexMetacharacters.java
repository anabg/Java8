package org.java8recipes.chapter03.recipe3_08;/**
 * Created by ÊAnita on 27/2/2017.
 *
 *
 * Regex Metacharacters
 * The regular expression metacharacters work as a short codes.
 *
 * Regex	Description
 * .	Any character (may or may not match terminator)
 * \d	Any digits, short of [0-9]
 * \D	Any non-digit, short for [^0-9]
 * \s	Any whitespace character, short for [\t\n\x0B\f\r]
 * \S	Any non-whitespace character, short for [^\s]
 * \w	Any word character, short for [a-zA-Z_0-9]
 * \W	Any non-word character, short for [^\w]
 * \b	A word boundary
 * \B	A non word boundary
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressionsRegexMetacharacters{

    public static void main(String args[]) {


        System.out.println("metacharacters d....");//        \\d means digit

        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d+", "4443"));//true (digit comes once or more times)
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\d+", "4443"));//true (digit comes once or more times)
        System.out.println(Pattern.matches("\\d*", "4443"));//true (digit may come 0 or more times)


        System.out.println("metacharacters D....");//  \\D means non-digit

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)

        System.out.println("metacharacters D with quantifier....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\D+", "abc"));//true (non-digit comes once or more times)

        System.out.println("metacharacters s Any whitespace character, short for [\\t\\n\\x0B\\f\\r]....");
        System.out.println(Pattern.matches("\\s", " "));//true (Any whitespace character)
        System.out.println(Pattern.matches("\\s", "\t"));//true (Any whitespace character)
        System.out.println(Pattern.matches("\\s", "\n"));//true (Any whitespace character)
        System.out.println(Pattern.matches("\\s", "1"));//false (digit)
        System.out.println(Pattern.matches("\\s", "a"));//false (non digit)



        System.out.println("metacharacters S Any non-whitespace character, short for [^\\s]....");

        System.out.println(Pattern.matches("\\S", " "));//false (Any non-whitespace character)
        System.out.println(Pattern.matches("\\S", "\t"));//false (Any non-whitespace character)
        System.out.println(Pattern.matches("\\S", "\n"));//false (Any non-whitespace character)
        System.out.println(Pattern.matches("\\S", "1"));//true (Any non-whitespace character)(digit)
        System.out.println(Pattern.matches("\\S", "a"));//true (Any non-whitespace character)(non digit)

        System.out.println("metacharacters w Any word character, short for [a-zA-Z_0-9]....");

        System.out.println(Pattern.matches("\\w", "a"));//true
        System.out.println(Pattern.matches("\\w", "9"));//true
        System.out.println(Pattern.matches("\\w", "\t"));//false

        System.out.println("metacharacters W Any non-word character, short for [^\\w]....");
        System.out.println(Pattern.matches("\\W", "a"));//false
        System.out.println(Pattern.matches("\\W", "9"));//false
        System.out.println(Pattern.matches("\\W", "\t"));//true
    }
}
